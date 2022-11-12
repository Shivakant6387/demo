package com.ConditionOP.com;

import java.util.Scanner;

public class Test4 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter some number");
        int age=sc.nextInt();
        if(age>=14 && age<=55){
            System.out.println("This boy is Young ");
        }
        else {
            System.out.println("This boy is not Young");
        }
    }
}
