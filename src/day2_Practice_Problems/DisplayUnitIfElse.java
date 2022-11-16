package day2_Practice_Problems;

import java.util.Scanner;

public class DisplayUnitIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Single unit");
                break;
            case 10:
                System.out.println("Two unit");
                break;
            case 100:
                System.out.println("Three unit");
                break;
            case 1000:
                System.out.println("Four unit");
                break;
            case 10000:
                System.out.println("Five unit");
                break;
            case 100000:
                System.out.println("Six unit");
                break;
            case 1000000:
                System.out.println("Seven unit");
                break;
            case  10000000:
            System.out.println("Eight unit");
            break;
            case 100000000:
            System.out.println("Nine unit");
            break;
            default:
                System.out.println("invalid number");
        }
    }
}
