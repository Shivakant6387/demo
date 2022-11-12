package com.Switch.com;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter domain name");
        String domain=scanner.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        switch (ext){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
            default:
                System.out.println("Invalid domain");
        }
    }
}
