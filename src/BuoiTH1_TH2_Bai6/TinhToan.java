/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1_TH2_Bai6;

import static java.lang.Double.valueOf;

/**
 *
 * @author Administrator
 */
public class TinhToan {

    public long tongA(int n) {
        long sum = 1;
        for (int i = 2; i <= n; i++) {
            sum += Math.pow(-1, i) * (i);
        }
        return sum;
    }

    public long giaithua(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public long tongB(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += giaithua(i);
        }
        return sum;
    }

    public long tongC(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 2 != 0) {
                if (i % 2 != 0) {
                    sum += i;
                }
            } else if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public double tongD(int n) {
        double sum = 0;
        for (double i = 2; i <= n; i++) {
            sum += (i - 1) / i;

        }
        return sum;
    }

    public double tongNC(int n, int x, int k) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += giaithua(i) / (Math.pow(x, i) + Math.pow(-1, i + 1) * Math.pow(k, i));
        }
        return sum;
    }
}
