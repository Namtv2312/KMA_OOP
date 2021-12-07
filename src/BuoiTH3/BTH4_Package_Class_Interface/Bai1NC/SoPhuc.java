/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.Bai1NC;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SoPhuc {

    double phanThuc;
    double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public SoPhuc() {
    }

    public void nhapSoPhuc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan thuc");
        phanThuc = sc.nextDouble();
        System.out.println("Nhap phan ao: ");
        phanAo = sc.nextDouble();

    }

    public void inSoPhuc() {
        System.out.printf("%.2f + %.2fi", phanThuc, phanAo);
        System.out.println("");
    }

    SoPhuc congSoPhuc(SoPhuc sp) {
        phanThuc = this.phanThuc + sp.phanThuc;
        phanAo = this.phanAo + sp.phanAo;
        return new SoPhuc(phanThuc, phanAo);
    }

    SoPhuc nhanSoPhuc(SoPhuc sp) {
        phanThuc = this.phanThuc * sp.phanThuc - this.phanAo * sp.phanAo;
        phanAo = this.phanAo * sp.phanThuc + sp.phanAo * this.phanThuc;
        return new SoPhuc(phanThuc, phanAo);
    }

    SoPhuc chiaSoPhuc(SoPhuc sp) {
        phanThuc = (this.phanThuc * sp.phanThuc + this.phanAo * sp.phanAo) / (sp.phanAo * sp.phanAo + sp.phanThuc * sp.phanThuc);
        phanAo = (sp.phanThuc * this.phanAo - sp.phanAo * this.phanThuc) / (sp.phanAo * sp.phanAo + sp.phanThuc * sp.phanThuc);
        return new SoPhuc(phanThuc, phanAo);
    }
}
