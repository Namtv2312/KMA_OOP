/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranVanNam_AT160632;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
public class InterfaceMain extends javax.swing.JFrame {

    ArrayList<SinhVienATTT> svatttlst = new ArrayList<>();
    ArrayList<SinhVienMatMa> svMMlst = new ArrayList<>();

    /**
     * Creates new form InterfaceMain
     */
    public InterfaceMain() {
        initComponents();
        setLocationRelativeTo(null);
        showDate();
        showTime();

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

        btnGroupSex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMSV = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        txtdiem = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtHocphi = new javax.swing.JTextField();
        rbSvATTT = new javax.swing.JRadioButton();
        rbSVMM = new javax.swing.JRadioButton();
        cbSex = new javax.swing.JComboBox<>();
        dateLab = new javax.swing.JLabel();
        timeLab = new javax.swing.JLabel();
        btnADD = new javax.swing.JButton();
        btnXuat = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtdonvi = new javax.swing.JTextField();

        btnGroupSex.add(rbSVMM);
        btnGroupSex.add(rbSvATTT);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 51)), "Quan Ly Sinh Vien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Ma sinh vien");

        jLabel2.setText("Ho ten");

        jLabel3.setText("Ngay sinh");

        jLabel4.setText("Gioi tinh");

        jLabel5.setText("Diem trung binh");

        jLabel6.setText("Don vi");

        jLabel7.setText("Luong ");

        jLabel8.setText("Hoc phi");

        txtHoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHotenActionPerformed(evt);
            }
        });

        txtNgaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaysinhActionPerformed(evt);
            }
        });

        rbSvATTT.setText("Sinh vien ATTT");
        rbSvATTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSvATTTActionPerformed(evt);
            }
        });

        rbSVMM.setText("SV mat ma");
        rbSVMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSVMMActionPerformed(evt);
            }
        });

        cbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "nu" }));
        cbSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexActionPerformed(evt);
            }
        });

        dateLab.setText("jLabel9");

        timeLab.setText("jLabel9");

        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnXuat.setText("Xuat");
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMSV)
                                    .addComponent(txtHoten)
                                    .addComponent(txtNgaysinh)
                                    .addComponent(txtdiem)
                                    .addComponent(txtHocphi)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtdonvi)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(rbSvATTT)
                                        .addGap(142, 142, 142)
                                        .addComponent(rbSVMM, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(0, 81, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateLab)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(timeLab)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSVMM)
                    .addComponent(rbSvATTT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADD)
                    .addComponent(btnXuat)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("QUAN LI SINH VIEN\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        try {
            String msv = txtMSV.getText();
            double diemYb = Double.valueOf(txtdiem.getText());
            String donvi = txtdonvi.getText();
            String hoTen = txtHoten.getText();
            String hocPhi = txtHocphi.getText();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dateString = df.parse(txtNgaysinh.getText());
            SinhVienATTT svattt;
            String gioiTinh = cbSex.getSelectedItem().toString();
            if (rbSvATTT.isSelected()) {
                float hocphi = Float.valueOf(hocPhi);
                svattt = new SinhVienATTT(hocphi, msv, hoTen, dateString, gioiTinh, diemYb);
                svatttlst.add(svattt);

            }
            if (rbSVMM.isSelected()) {
                int luong = Integer.valueOf(txtLuong.getText());
                SinhVienMatMa svmm = new SinhVienMatMa(donvi, luong, msv, hoTen, dateString, gioiTinh, diemYb);
                svMMlst.add(svmm);
            }
            Date date = new Date();
            String DatetoStr = DateFormat.getDateTimeInstance().format(date);
            System.out.println(DatetoStr);
            clearData();
        } catch (Exception ex) {
      
             JOptionPane.showMessageDialog(this, "Sai hoac thieu thong tin roi", "Error", 2);
        }
    }//GEN-LAST:event_btnADDActionPerformed

    void clearData() {
        txtMSV.requestFocus();
        txtMSV.setText(null);
        txtHocphi.setText(null);
        txtHoten.setText(null);
        txtLuong.setText(null);
        txtNgaysinh.setText(null);
        txtdonvi.setText(null);
        txtdiem.setText(null);
        cbSex.setSelectedIndex(0);
    }
    private void rbSvATTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSvATTTActionPerformed
        txtdonvi.setEnabled(false);
        txtLuong.setEnabled(false);
        txtHocphi.setEnabled(true);
    }//GEN-LAST:event_rbSvATTTActionPerformed

    private void txtHotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHotenActionPerformed

    private void txtNgaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaysinhActionPerformed
        // TODO add your handling code here:

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            Date birth = df.parse(txtNgaysinh.getText());

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Sai dinh dang roi", "Error", 2);
        }

    }//GEN-LAST:event_txtNgaysinhActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
        if (rbSVMM.isSelected()) {
            File file = new File("E:\\KMA_OOP\\test\\TranVanNam_AT160632\\svmm.dat");
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < svMMlst.size(); i++) {
                    bw.write("Sinh Vien Mat Ma thu" + (i + 1) + "{");
                    bw.newLine();
                    bw.write(svMMlst.get(i).toString());
                    bw.newLine();
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "SUCCEESS", "Messege", 1);
            } catch (IOException ex) {
                Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error", "loi", 2);
            }
        } else if (rbSvATTT.isSelected()) {
            File file = new File("E:\\KMA_OOP\\test\\TranVanNam_AT160632\\svat.dat");
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < svatttlst.size(); i++) {
                    bw.write("Sinh Vien ATTT thu" + (i + 1) + "{");
                    bw.newLine();
                    bw.write(svatttlst.get(i).toString());
                    bw.newLine();
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "SUCCESS", "Messege", 1);
            } catch (IOException ex) {
                Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error", "loi", 2);
            }
        }/*
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("TEST.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(svMMlst);
            oos.close();
            fos.close();
            JOptionPane.showMessageDialog(this, "ok", "OK", 2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rbSVMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSVMMActionPerformed
        txtHocphi.setEnabled(false);
        txtdonvi.setEnabled(true);
        txtLuong.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_rbSVMMActionPerformed

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        if (rbSvATTT.isSelected()) {
            try {
                File file = new File("E:\\KMA_OOP\\test\\TranVanNam_AT160632\\svat.dat");
                FileReader fw = new FileReader(file);
                BufferedReader bw = new BufferedReader(fw);

                String s;
                while ((s = bw.readLine()) != null) {
                    System.out.println(s);
                }
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (rbSVMM.isSelected()) {
            try {
                File file = new File("E:\\KMA_OOP\\test\\TranVanNam_AT160632\\svmm.dat");
                FileReader fw = new FileReader(file);
                BufferedReader bw = new BufferedReader(fw);

                String s;
                while ((s = bw.readLine()) != null) {
                    System.out.println(s);
                }
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfaceMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnXuatActionPerformed

    private void cbSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JButton btnXuat;
    private javax.swing.JComboBox<String> cbSex;
    private javax.swing.JLabel dateLab;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbSVMM;
    private javax.swing.JRadioButton rbSvATTT;
    private javax.swing.JLabel timeLab;
    private javax.swing.JTextField txtHocphi;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMSV;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtdiem;
    private javax.swing.JTextField txtdonvi;
    // End of variables declaration//GEN-END:variables
}
