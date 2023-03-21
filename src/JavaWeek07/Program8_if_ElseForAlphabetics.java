package JavaWeek07;

import java.util.Scanner;

/*
**8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Program8_if_ElseForAlphabetics
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter any alphabet city from A to F:");

        char city = sn.next().charAt(0);

        if(city == 'A')
        {
            System.out.println("Entered city Name is Ahmedabad");
        }
        else if (city == 'B')
        {
            System.out.println("Entered city Name is Bombay");
        }
        else if (city == 'C')
        {
            System.out.println("Entered city Name is Chennai");
        }
        else if (city == 'D')
        {
            System.out.println("Entered city Name is Delhi");
        }
        else if (city == 'E')
        {
            System.out.println("Entered city Name is Ellora");
        }
        else if (city == 'F')
        {
            System.out.println("Entered city Name is Faridabad");
        }
        else
        {
            System.out.println("Entered city Name is Invalid");
        }
        sn.close();
    }
}
