package JavaWeek07;

import java.util.Scanner;

/*
** 9. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry using switch statement.
*/
public class Program9_SwitchStatmentForAlphabetics
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter any alphabet city from A to F:");

        char C = sn.next().charAt(0);

        switch (C)
        {
            case 'A':
                System.out.println("Entered city Name is Ahmedabad");
                break;
            case 'B':
                System.out.println("Entered city Name is Bombay");
                break;
            case 'C':
                System.out.println("Entered city Name is Chennai");
                break;
            case 'D':
                System.out.println("Entered city Name is Delhi");
                break;
            case 'E':
                System.out.println("Entered city Name is Ellora");
                break;
            case 'F':
                System.out.println("Entered city Name is Faridabad");
                break;
            default:
                System.out.println("Entered city Name is Invalid");
                break;
        }
        sn.close();
    }
}
