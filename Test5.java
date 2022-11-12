package com.ConditionOP.com;

import java.util.Scanner;

public class Test5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter three masks number");
        int m1= sc.nextInt();
        int m2= sc.nextInt();
        int m3= sc.nextInt();
        float avg=(float) (m1+m2+m3)/3;
        if(avg>=70){
            System.out.println("Grad A");
        } else if (avg>=60 && avg<70) {
            System.out.println("Grad B");
        } else if (avg>=50 &&avg<60) {
            System.out.println("Grad C");
        } else if (avg>=40 && avg<50) {
            System.out.println("Grad D");
        } else {
            System.out.println("Failed");
        }
    }
}
