package day2_Practice_Problems;

import java.util.Scanner;

public class ReverseNumberUsingWhileLoop {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int i = sc.nextInt();
        String rev = "";
        System.out.println("Reverse numbers are ");
        while (i != 0){
            rev =String.valueOf(i%10);
            i = i/10;
            System.out.print(  rev +" ");
        }

    }
}
