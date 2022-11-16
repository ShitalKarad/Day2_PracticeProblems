package day2_Practice_Problems;

import java.util.Scanner;

public class SumOfNaturalNumberUsingWhile {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int a = sc.nextInt();
        int sum =0;
        int i = 1;
        while ( i<= a){
            sum +=i;
            System.out.println(sum);
            i++;

        }
    }
}
