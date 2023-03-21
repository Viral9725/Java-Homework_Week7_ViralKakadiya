package JavaWeek07;

import java.util.Scanner;

/*
**
* 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */
public class Program11_dividebyThreeAndFive
{
    public static void main(String[] args)
    {

        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int i = sn.nextInt();

        //Main Logic of the Program with If_Else Condition

        System.out.println("\nDivided by 3: ");
        for (i =0;i<=100;i++)
        {
            if (i%3 == 0)
            {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nDivided by 5: ");
        for (i=1; i<100; i++)
        {
             if (i%5==0)
                 System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (i=1; i<100; i++)
        {
            if (i%3==0 && i%5==0)
                System.out.print(i +", ");
        }

        System.out.println("\n");
        sn.close();

    }
}
