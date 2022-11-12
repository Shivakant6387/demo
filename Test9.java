//find  type of website and the protocol used
package com.ConditionOP.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test9 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter url");
        String url=scanner.nextLine();
        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http"))
            System.out.println("HyperText Transfer Protocol");
        else if (protocol.equals("ftl"))
            System.out.println("File Transfer Protocol");



            String ext =url.substring(url.lastIndexOf(".")+1);
            if(ext.equals("com"))
                System.out.println("Commercial");
            else if(ext.equals("org"))
                System.out.println("Organisation");
            else if (ext.equals("net"))
                System.out.println("Network");

        }
    }

