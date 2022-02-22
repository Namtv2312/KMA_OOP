/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPMN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Management {

    Hashtable<String, Integer> compar = new Hashtable<String, Integer>();
    Hashtable<String, Double> comparKH = new Hashtable<String, Double>();
    ArrayList<Product> proList = new ArrayList<>();
    ArrayList<Customer> cusList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Management() {
        proList = new ArrayList<>();
        cusList = new ArrayList<>();
    }

    public void menu() {
        System.out.println("\t\t\t QUẢN LÝ SUPERMARKET");
        System.out.println("1. Nhap cac san pham");
        System.out.println("2. Them khach hang");
        System.out.println("3. Sua doi thong tin khach hang theo MKH");
        System.out.println("4. Sua doi thong tin san pham theo MSP");
        System.out.println("5. In danh sach san pham");
        System.out.println("6. Mua san pham");
        System.out.println("7. Sap xep thu tu tang dan cua list khach hang");
        System.out.println("8. Hien thi khach hang co tong tien mua lon nhat");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public void nhapSPs() {
        while (Boolean.TRUE) {
            int check = 0;
            Product tmp = new Product();
            tmp.nhapmaSP();
            for (int i = 0; i < proList.size(); i++) {
                if (proList.get(i).maSanpham.equalsIgnoreCase(tmp.maSanpham)) {
                    compar.put(tmp.maSanpham, compar.get(tmp.maSanpham) + 1);
                    check = 1;
                }
            }
            if (check == 0) {
                tmp.nhaptenSP();
                tmp.nhapdongiaSP();
                tmp.nhapngaySX();

                compar.put(tmp.maSanpham, 1);
                proList.add(tmp);
            }

            System.out.println("Co nhap nua khong(Y/N)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void inSPs() {
        for (int i = 0; i < proList.size(); i++) {
            System.out.print(i + 1 + ".");
            proList.get(i).xuatSP();
            System.out.println("So luong: " + compar.get(proList.get(i).maSanpham));

        }
    }

    public void editSPs() {
        String nam;
        int check = 0;
        System.out.println("Nhap ma san pham muon sua");
        nam = sc.nextLine();
        for (int i = 0; i < proList.size(); i++) {
            if (proList.get(i).maSanpham.equalsIgnoreCase(nam)) {
                proList.get(i).nhaptenSP();
                proList.get(i).nhapdongiaSP();
                proList.get(i).nhapngaySX();
                check = 1;
            }

        }
        if (check == 0) {
            System.out.println("Khong co ton tai ma san pham nhu the");
        }
    }

    public void addKHs() {
        while (Boolean.TRUE) {
            int check = 0;
            Customer tmp = new Customer();
            tmp.nhapmaKH();
            for (int i = 0; i < cusList.size(); i++) {
                if (cusList.get(i).maKhachhang.equalsIgnoreCase(tmp.maKhachhang)) {
                    System.out.println("Khach hang da ton tai");
                    check = 1;
                }
            }
            if (check == 0) {
                tmp.nhaptenKH();
                tmp.nhapnamsinhKH();
                tmp.nhapdcKH();
                cusList.add(tmp);
                comparKH.put(tmp.maKhachhang, 0.0);
            }

            System.out.println("Co nhap nua khong(Y/N)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void editKHs() {
        String nam;
        int check = 0;
        System.out.println("Nhap ma khach hang muon sua");
        nam = sc.nextLine();
        for (int i = 0; i < cusList.size(); i++) {
            if (cusList.get(i).maKhachhang.equalsIgnoreCase(nam)) {
                cusList.get(i).nhaptenKH();
                cusList.get(i).nhapdcKH();
                cusList.get(i).nhapnamsinhKH();
                check = 1;
            }

        }
        if (check == 0) {
            System.out.println("Khong co ton tai ma khach hang nhu the");
        }
    }

    public void buySPs() {
        while (Boolean.TRUE) {
            int check = 0;
            Product tmp = new Product();
            Customer tmpCustomer = new Customer();
            tmp.nhapmaSP();
            int soluong;
            while (true) {

                try {
                    System.out.println("Nhap so luong: ");
                    soluong = sc.nextInt();
                    if (soluong <= 0) {
                        System.out.println("So luong phai lon hon 0");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Nhap type int");
                    sc.nextLine();
                }

            }
            sc.nextLine();
            for (int i = 0; i < proList.size(); i++) {
                if (proList.get(i).maSanpham.equalsIgnoreCase(tmp.maSanpham)) {

                    if (compar.get(proList.get(i).maSanpham) >= soluong) {
                        int chk = 0;
                        tmpCustomer.nhapmaKH();
                        for (int j = 0; j < cusList.size(); j++) {
                            if (cusList.get(j).maKhachhang.equalsIgnoreCase(tmpCustomer.maKhachhang)) {
                                comparKH.put(tmpCustomer.maKhachhang, comparKH.get(tmpCustomer.maKhachhang) + proList.get(i).donGia * soluong);
                                compar.put(proList.get(i).maSanpham, compar.get(proList.get(i).maSanpham) - soluong);
                                chk = 1;

                            }
                        }
                        if (chk == 0) {
                            tmpCustomer.nhaptenKH();
                            tmpCustomer.nhapdcKH();
                            tmpCustomer.nhapnamsinhKH();
                            comparKH.put(tmpCustomer.maKhachhang, proList.get(i).donGia * soluong);
                            cusList.add(tmpCustomer);
                            compar.put(proList.get(i).maSanpham, compar.get(proList.get(i).maSanpham) - soluong);
                        }

                    } else {
                        System.out.println("So luong khong co san");
                        break;
                    }
                    check = 1;
                }
            }

            if (check == 0) {
                System.out.println("San pham ban chon khong ton tai hoac khong co san\n Vui long thu lai");
            }

            System.out.println(
                    "Co nhap nua khong(Y/N)");
            String s = sc.nextLine();

            if (s.equalsIgnoreCase(
                    "N")) {
                break;
            }
        }
    }

    public void listKHsUP() {
        System.out.println("Danh sach khach hang : " + comparKH);

        List<Map.Entry<String, Double>> list = new ArrayList<Entry<String, Double>>(comparKH.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {

            public int compare(Entry<String, Double> entry1, Entry<String, Double> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }

        });
        System.out.println("DANH SACH KHACH HANG (SORTED)");

        for (Map.Entry<String, Double> entry : list) {
            for (int i = 0; i < cusList.size(); i++) {
                if (cusList.get(i).maKhachhang.equalsIgnoreCase(entry.getKey())) {
                    cusList.get(i).xuatKH();
                    System.out.println("So tien: " + comparKH.get(cusList.get(i).maKhachhang));
                }
            }
        }

    }

    public void maxKHs() {
        System.out.println("KHACH HANG VIP");
        String maxKey = null;
        Double maxValue = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : comparKH.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        for (int i = 0; i < cusList.size(); i++) {
            if (cusList.get(i).maKhachhang.equalsIgnoreCase(maxKey)) {
                cusList.get(i).xuatKH();
            }
        }

    }

}
