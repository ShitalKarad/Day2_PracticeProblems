package day2_Practice_Problems;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void  main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character ");
        char ch = sc.next().charAt(0);

        switch(ch) {
            case'a':
                System.out.println("vowel");
            break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");

                break;

            case '0':
                System.out.println("vowel");

                break;

            case 'u':
                System.out.println("vowel");

                break;

            default:
                System.out.println("Consonant");
        }

    }
}
