/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi11.BTVN.Suongsuong_Bai2;

import Buoi10.BTVN.Bai4.InterfaceMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author NAM SYSTEM
 */
public class Form extends javax.swing.JFrame {

    ArrayList<Student> stdlst = new ArrayList<>();

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        setLocationRelativeTo(null);
        showDate();
        showTime();
        checkBlank();
    }

    private void checkBlank() {
        if (txtDiachi.getText().isEmpty() || txtDiem.getText().isEmpty() || txtEmail.getText().isEmpty() || txtHoten.getText().isEmpty() || txtMsv.getText().isEmpty() || txtNgaysinh.getText().isEmpty()) {
            btnADD.setEnabled(false);
        } else {
            btnADD.setEnabled(true);
        }
    }

    private void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        dateLab.setText(s.format(d));
    }

    private void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a ");
                timeLab.setText(s.format(d));
            }
        }
        ).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnADD = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CbSEX = new javax.swing.JComboBox<>();
        txtHoten = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtMsv = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        dateLab = new javax.swing.JLabel();
        timeLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinh Vien");

        jLabel1.setText("Họ tên");

        jLabel2.setText("Ngày sinh");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("Gioi tính");

        btnADD.setText("Them");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnSave.setText("Luu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADD)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Mã sinh viên");

        jLabel6.setText("Email");

        jLabel7.setText("Điểm tổng kết");

        CbSEX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "nữ" }));
        CbSEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbSEXActionPerformed(evt);
            }
        });
        CbSEX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbSEXKeyPressed(evt);
            }
        });

        txtHoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHotenActionPerformed(evt);
            }
        });
        txtHoten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHotenKeyPressed(evt);
            }
        });

        txtNgaysinh.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtNgaysinhMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtNgaysinhMouseMoved(evt);
            }
        });
        txtNgaysinh.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                txtNgaysinhMouseWheelMoved(evt);
            }
        });
        txtNgaysinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNgaysinhMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNgaysinhMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNgaysinhMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNgaysinhMouseReleased(evt);
            }
        });
        txtNgaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaysinhActionPerformed(evt);
            }
        });
        txtNgaysinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNgaysinhKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNgaysinhKeyTyped(evt);
            }
        });

        txtDiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiachiActionPerformed(evt);
            }
        });
        txtDiachi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiachiKeyPressed(evt);
            }
        });

        txtMsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsvActionPerformed(evt);
            }
        });
        txtMsv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMsvKeyPressed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemActionPerformed(evt);
            }
        });
        txtDiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiemKeyPressed(evt);
            }
        });

        dateLab.setText("jLabel8");

        timeLab.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiachi)
                            .addComponent(txtMsv)
                            .addComponent(txtEmail)
                            .addComponent(txtDiem)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CbSEX, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(dateLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(timeLab)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CbSEX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHotenActionPerformed
        checkBlank();        // TODO add your handling code here:
    }//GEN-LAST:event_txtHotenActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        String hoTen = txtHoten.getText();
        String ngaySinh = txtNgaysinh.getText();
        String diaChi = txtDiachi.getText();
        String gioiTinh = CbSEX.getSelectedItem().toString();
        String masv = txtMsv.getText();
        String email = txtEmail.getText();
        double diem = Double.valueOf(txtDiem.getText());
        stdlst.add(new Student(masv, email, diem, hoTen, ngaySinh, diaChi, gioiTinh));
        for (int i = 0; i < stdlst.size(); i++) {
            System.out.println(stdlst.get(i).toString());
        }
        clearData();
    }//GEN-LAST:event_btnADDActionPerformed

    private void txtNgaysinhMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgaysinhMouseMoved

    }//GEN-LAST:event_txtNgaysinhMouseMoved

    private void txtNgaysinhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgaysinhMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhMouseExited

    private void txtNgaysinhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgaysinhMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhMouseEntered

    private void txtNgaysinhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgaysinhKeyPressed
        switch (evt.getKeyCode()) {

            case KeyEvent.VK_ENTER:
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date birth = df.parse(txtNgaysinh.getText());
                    JOptionPane.showMessageDialog(null, "Hợp lệ", "thông báo", JOptionPane.INFORMATION_MESSAGE);
                    txtDiachi.requestFocus();
                } catch (ParseException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Lỗi", "Nhập lại", 2);
                }
                break;
            case 40:
                txtDiachi.requestFocus();
                break;
            case 38:
                txtHoten.requestFocus();
                break;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhKeyPressed

    private void txtNgaysinhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgaysinhKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhKeyTyped

    private void txtNgaysinhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgaysinhMousePressed

    }//GEN-LAST:event_txtNgaysinhMousePressed

    private void txtNgaysinhMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgaysinhMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhMouseReleased

    private void txtNgaysinhMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgaysinhMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhMouseDragged

    private void txtNgaysinhMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_txtNgaysinhMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhMouseWheelMoved

    private void txtHotenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHotenKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                txtNgaysinh.requestFocus();
                break;
        }
    }//GEN-LAST:event_txtHotenKeyPressed

    private void txtDiachiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiachiKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
            case 40:
                CbSEX.requestFocus();
                break;
            case 38:
                txtNgaysinh.requestFocus();
                break;
        }     // TODO add your handling code here:
    }//GEN-LAST:event_txtDiachiKeyPressed

    private void CbSEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbSEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbSEXActionPerformed

    private void CbSEXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbSEXKeyPressed

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                txtMsv.requestFocus();
                break;
            case 40:
                txtMsv.requestFocus();
                break;
            case 38:
                txtDiachi.requestFocus();
                break;        // TODO add your handling code here:
        }
    }//GEN-LAST:event_CbSEXKeyPressed

    private void txtMsvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMsvKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
            case 40:
                txtEmail.requestFocus();
                break;
            case 38:
                CbSEX.requestFocus();
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsvKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
            case 40:
                txtDiem.requestFocus();
                break;
            case 38:
                txtMsv.requestFocus();
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtDiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiemKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
            case 40:
                txtHoten.requestFocus();
                break;
            case 38:
                txtEmail.requestFocus();
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        File file = new File("D:\\Java\\KIT\\Kit_Java04\\Kit_JavaSwing\\sinhvien.dat");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < stdlst.size(); i++) {

                bw.write("Sinh Vien thu" + (i + 1) + "{");
                bw.newLine();
                bw.write(stdlst.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "OK", "Messege", 1);
        } catch (IOException ex) {
            Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error", "loi", 2);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemActionPerformed
        if (Double.valueOf(txtDiem.getText()) > 0 && Double.valueOf(txtDiem.getText()) < 10) {

        } else {
            JOptionPane.showMessageDialog(this, "LOI", "error", 2);
            txtDiem.requestFocus();
            txtDiem.setText(null);
        }
        checkBlank();
    }//GEN-LAST:event_txtDiemActionPerformed

    private void txtNgaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaysinhActionPerformed
        checkBlank();        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhActionPerformed

    private void txtDiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiachiActionPerformed
        checkBlank();        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiachiActionPerformed

    private void txtMsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsvActionPerformed
        checkBlank();        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsvActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        checkBlank();        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    void clearData() {
        txtHoten.requestFocus();
        txtHoten.setText(null);
        txtDiachi.setText(null);
        txtDiem.setText(null);
        txtEmail.setText(null);
        txtMsv.setText(null);
        txtNgaysinh.setText(null);
        CbSEX.setSelectedIndex(0);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbSEX;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel dateLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timeLab;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMsv;
    private javax.swing.JTextField txtNgaysinh;
    // End of variables declaration//GEN-END:variables
}
