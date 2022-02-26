/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_Book.Controlers;

import Bai1_Book.Models.Book_Model;
import Bai1_Book.Views.Book_View;
import Bai1_Book.Views.Table_View;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NAM SYSTEM
 */
public class Book_Controler {

    ArrayList<Book_Model> al = new ArrayList<>();
    Book_View view;
    Table_View vieww;
    DefaultTableModel model;

    public Book_Controler(Book_View view, Table_View vieww) {
        this.view = view;
        view.getBtnadd().addActionListener(al -> btnThemPerform());
        view.getBtnreset().addActionListener(a -> btnResett());
        view.getBtnluu().addActionListener(l -> btnHienthi());
        this.vieww = vieww;
        model = (DefaultTableModel) vieww.getList().getModel();
    }

    public void btnResett() {
        view.getTxtid().setText(null);
        view.getTxtca().setText(null);
        view.getTxttitle().setText(null);
        view.getTxtauthor().setText(null);
    }

    public void btnThemPerform() {

        if (view.hople()) {
            view.getBtnluu().setEnabled(true);
            view.getBtnreset().setEnabled(true);
            Book_Model bm = view.getmodel();
            al.add(bm);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("books.dat")));
                for (Book_Model tmp : al) {
                    bw.write(tmp.toString());
                    bw.newLine();
                }
                bw.close();

            } catch (IOException ex) {
                Logger.getLogger(Book_Controler.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            view.showError();
        }
        btnResett();
    }

    private void btnHienthi() {
        view.setVisible(false);
        vieww.setVisible(true);
        try {
            String[] header = {"ID", "Authors", "Title", "Category"};
            BufferedReader br = new BufferedReader(new FileReader(new File("books.dat")));

            model.setColumnIdentifiers(header);
            Object[] lie = br.lines().toArray();
            model.setRowCount(0);
            for (int i = 0; i < lie.length; i++) {
                String[] dat = lie[i].toString().trim().split("\\$");
                model.addRow(dat);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("fail");
        }
    }
}
