/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH_END.Exception.Bai1_Dayso;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DaySo {

    private int n;
    private int m[];

    public DaySo() {
    }

    public DaySo(int n, int[] m) {
        this.n = n;
        this.m = m;
    }
    static Scanner sc = new Scanner(System.in);

    static void nhap(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]= ", i + 1);
            a[i] = sc.nextInt();
        }
    }

    static void xuat(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
        }
    }

    static void sx_tang(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        xuat(a);
    }

    static void sx_giam(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        xuat(a);
    }

    static void ghep(int[] a, int[] b, int[] c, int sd, int sa) {
        int j = 0, k = 0;
        for (int i = 0; i < sd; i++) {
            a[i] = b[j++];
        }
        for (int i = sd; i < a.length; i++) {
            a[i] = c[k++];
        }
        xuat(a);
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

    static void sx(int[] a) {
        int j = 0, k = 0;
        int[] b = new int[100];
        int[] c = new int[100];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                c[k++] = a[i];
            } else {
                b[j++] = a[i];
            }
        }
        sx_tang(b, j);
        sx_giam(c, k);
        ghep(a, b, c, j, k);
        xuat(a);
    }

    static public boolean isPrime(int m) {
        for (int i = 2; i <= sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void inSNT(int[] m) {
        for (int i = 0; i < m.length; i++) {
            if (isPrime(m[i])) {
                System.out.println(m[i]);
            }
        }
    }

    public void inSHH(int[] m) {
        for (int i = 0; i < m.length; i++) {
            if (testPerfect(m[i])) {
                System.out.println(m[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap day: ");
        nhap(a);
        DaySo d = new DaySo(n, a);
        System.out.println("So haon hao");
        d.inSHH(a);
        System.out.println("So nguyen to trong day");
        d.inSNT(a);
        DaySo.sx_giam(a, n);
        DaySo.sx_tang(a, n);
DaySo.sx(a);
        System.out.println();
    }
}
