package JavaWeek07;


import java.util.Scanner;

/*
** 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class Program2_leapYear
{
    //main Method
    public static void main(String[] args)
    {
        int year;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter Year:");

        year = sn.nextInt();

        // if_Else Condition for leap Year

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year+ "  is a leap year: ");
                } else {
                    System.out.println(year+ "  is not  leap year:");
                }
            } else {
                System.out.println(year + "  is not  leap year:");
            }
        }else {
            System.out.println(year+ "  is not a leap year:");
        }

            sn.close();
    }
}
