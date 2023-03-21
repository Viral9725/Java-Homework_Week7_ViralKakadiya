package JavaWeek07;

import java.util.Scanner;

/*
**16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */
public class Program16_CheckNumber
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int number = sn.nextInt();

        if (number>=0)
        {
            System.out.println("Number You Entered "+number+" is Positive.");
        }
        else if (number< 0)
        {
            System.out.println("Number You Entered " +number+" is Negative.");
        }
        else
        {
            System.out.println("Number You Entered "+number+" is Zero.");
        }
    }

}
