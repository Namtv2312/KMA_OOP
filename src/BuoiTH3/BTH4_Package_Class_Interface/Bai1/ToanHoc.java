/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH3.BTH4_Package_Class_Interface.Bai1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Administrator
 */
public class ToanHoc {

    int n;

    static public boolean isPrime(int m) {
        for (int i = 2; i <= sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    static public boolean testPerfect(int n) {
        int i = 1;
        int sum = 0;
        while (i < n) {
            if (n % i == 0) {
                sum += i++;
            } else {
                i++;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;

    }

    public static boolean testSCP(int n) {
        int x = (int) Math.sqrt(n);
        if (Math.pow(x, 2) == n) {
            return true;
        }
        return false;
    }

    public void inSCP(int n) {
        for (int i = 0; i < n; i++) {
            if (testSCP(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static int fibonaci(int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static double tong5(int n) {
        double sum = 0;
        for (double i = 2; i <= n; i++) {
            sum += (i - 1) / i;

        }
        return sum;
    }

    public static long giaithua(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static double tong6(int n, int x, int k) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += giaithua(i) / (Math.pow(x, i) + Math.pow(-1, i + 1) * Math.pow(k, i));
        }
        return sum;
    }

    public static long tong7(int n) {
        long sum = 1;
        for (int i = 2; i <= n; i++) {
            sum += Math.pow(-1, i) * (i);
        }
        return sum;
    }

    public static long tong8(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += giaithua(i);
        }
        return sum;
    }

}
