//display name of a day based on number
package com.Switch.com;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter day number");
            int day=scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("invalid number");
            }
    }
}
