/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.Bai1NC;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {

        SoPhuc soPhuc1 = new SoPhuc();
        soPhuc1.nhapSoPhuc();
        soPhuc1.inSoPhuc();
        SoPhuc soPhuc2 = new SoPhuc();
        soPhuc2.nhapSoPhuc();
        soPhuc2.inSoPhuc();
        soPhuc1.nhanSoPhuc(soPhuc2).inSoPhuc();
        soPhuc1.congSoPhuc(soPhuc2).inSoPhuc();
        soPhuc1.chiaSoPhuc(soPhuc2).inSoPhuc();
    }
}
