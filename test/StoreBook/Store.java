/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreBook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Store {

    ArrayList<Book> bookLst = new ArrayList<>();

    public int totalItems;
    public int MAX_ITEMS = 9999;

    public void menu() {
        System.out.println("\t\t\t QUẢN LÝ THƯ VIỆN");
        System.out.println("1. Thêm cac muc sách");
        System.out.println("2. Sửa một mục sách");
        System.out.println("3. Xóa một mục sách");
        System.out.println("4. Tìm một mục sách");
        System.out.println("5. Xuất thông tin sách");
        System.out.println("6. Sap xep cac muc sach theo ten");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public Store(int totalItems, int MAX_ITEMS) {
        this.totalItems = totalItems;
        this.MAX_ITEMS = MAX_ITEMS;
    }

    public Store() {
        bookLst = new ArrayList<>();
    }
    Scanner sc = new Scanner(System.in);

    public void add() {

        int i = 0;
        while (i < MAX_ITEMS) {
            System.out.println("Nhap muc sach thu" + (++i));
            Book tmp = new Book();
            tmp.nhap();
            bookLst.add(tmp);
            System.out.println("Co nhap nua khong(Y/N)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N")) {
                break;
            }
        }
        totalItems = bookLst.size();
    }

    public void Delete() {
        String nam;
        int check = 0;
        System.out.println("Nhap ten sach muon xoa");
        nam = sc.nextLine();
        for (int i = 0; i < bookLst.size(); i++) {
            if (bookLst.get(i).name.equalsIgnoreCase(nam)) {
                bookLst.remove(i);

                check = 1;
            }

        }
        if (check == 0) {
            System.out.println("Khong co muc sach co ten nay trong thu vien");
        }
        totalItems = bookLst.size();
    }

    public void find() {
        String nam;
        int check = 0;
        System.out.println("Nhap ten sach muon tim kiem");
        nam = sc.nextLine();
        for (int i = 0; i < bookLst.size(); i++) {
            if (bookLst.get(i).name.equalsIgnoreCase(nam)) {
                bookLst.get(i).xuat();
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Khong co muc sach nao co ten nay trong thu vien");
        }
    }

    public void edit() {
        String nam;
        int check = 0;
        System.out.println("Nhap ten sach muon sua");
        nam = sc.nextLine();
        for (int i = 0; i < bookLst.size(); i++) {
            if (bookLst.get(i).name.equalsIgnoreCase(nam)) {
                System.out.println("Nhap lai ten sach");
                nam = sc.nextLine();
                System.out.println("Nhap lai ID sach");
                String ID;
                ID = sc.nextLine();
                System.out.println("Nhap lai gia sach: ");
                double gia;
                gia = sc.nextDouble();
                bookLst.get(i).setAll(ID, nam, gia);
                check = 1;
            }

        }
        if (check == 0) {
            System.out.println("Khong co muc sach nao co ten nay trong thu vien");
        }
    }

    public void sort(ArrayList<Book> list) {
        list.sort((o1, o2) -> o1.name.compareTo(o2.name));
    }

    public void list() {
        System.out.println("Danh sach cac muc trong thu vien");
        System.out.printf("Co  %d muc sach trong thu vien : ", totalItems);
        System.out.println("");
        for (int i = 0; i < bookLst.size(); i++) {
            System.out.print(i + 1 + ".");
            bookLst.get(i).xuat();

        }

    }
}
