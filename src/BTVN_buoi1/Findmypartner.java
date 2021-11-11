/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN_buoi1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Findmypartner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Random rand= new Random();
    int randNum = (int )rand.nextInt(80);
    int guessNum;
    randNum +=1;
    boolean notFound =true;
    while (notFound){
        System.out.println("Nhập số bạn đoán: ");
        guessNum=sc.nextInt();
        if (guessNum==randNum){
            notFound=false;
        }
        else if(guessNum>randNum){
            System.out.println("Số bạn đoán lớn hơn số của chúng tôi");
            notFound=true;
        }
        else {
            System.out.println("Số bạn đoán nhỏ hơn số của chúng tôi");
            notFound=true;
        }
    }
        System.out.println("Chúc mừng bạn đã đoán trúng");
    }
    
}
