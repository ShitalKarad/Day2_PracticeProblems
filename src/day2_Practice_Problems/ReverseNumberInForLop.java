package day2_Practice_Problems;

import java.util.Scanner;

public class ReverseNumberInForLop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        System.out.println("Reverse numbers are ");
        int i = sc.nextInt();
        int rev=0;
        for(; i!=0;i=i/10){
            int a = i%10;
            rev = rev*10+a;

        }
        System.out.println(rev + " ");
    }
}
