/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuoiTH1_TH2_Bai5;

import static java.lang.Math.sqrt;
import java.util.stream.IntStream;

/**
 *
 * @author Administrator
 */
public class ToanHoc {

    public  boolean isPrime(int m) {
        for (int i = 2; i <= sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
public boolean testPerfect(int n){
    int i=1;
    int sum=0;
    while(i<n){
        if(n%i==0)
        {
            sum+=i++;
        }
        else{
        i++;}
    }
    if (sum==n){
        return true;
    }
    return false;

}
public boolean testSCP(int n){
    int x= (int) Math.sqrt(n);
    if(Math.pow(x, 2)==n)
        return true;
    return false;
}
public void inSCP(int n){
    for(int i=0;i<n;i++)
    {
        if(testSCP(i))
            System.out.print(i+"\t");
    }
}
public int fibonaci(int n){
    if(n==0)return 2;
            if(n==1) return 1;
            return fibonaci(n-1)+fibonaci(n-2);
}
}
