package day2_Practice_Problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int rev=0,rem;
        int temp = num;
        while(temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
            if (num == rev)
                System.out.println (num + " is Palindrome");
            else
                System.out.println (num + " is not Palindrome");


    }
}
