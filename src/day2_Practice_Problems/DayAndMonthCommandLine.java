package day2_Practice_Problems;

public class DayAndMonthCommandLine {

    public static void main(String[] args){
        int month = Integer.valueOf(args[0]);
        int date = Integer.valueOf(args[1]);

        if ( month == 3 && date >= 20 ||  month == 6 && date <= 20  )
        System.out.println("True") ;

        else if ( month == 4 && date <=30 || month == 5 && date <=31) {
            System.out.println("True");
        } else{
            System.out.println("False") ;
        }


    }
}
