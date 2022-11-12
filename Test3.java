package com.ConditionOP.com;

import java.util.Scanner;

public class Test3 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("This is Even number");
        }
        else {
            System.out.println("This is Odd number");
        }
    }
}
