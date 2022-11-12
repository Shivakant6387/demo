package com.ConditionOP.com;

import java.util.Scanner;

public class Test6 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number here");
        int num=sc.nextInt();
        if(num%4==0){
            System.out.println(num+"this is leap year");
        }
        else{
            System.out.println(num+"This is not leap year");
        }
    }
}
