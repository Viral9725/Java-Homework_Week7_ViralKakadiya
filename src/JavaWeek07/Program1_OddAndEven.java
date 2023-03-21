package JavaWeek07;

import java.util.Scanner;

/*
 ** 1. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */
public class Program1_OddAndEven
{
    public static void main(String[] args)
    {
        int a;

        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Number:");

        a = sn.nextInt();

        //Main Logic of the Program
        String message = a % 2 == 0 ? "You Entered Number is Even" : "You Entered Number is Odd.";
        System.out.println(message);

        sn.close();
    }

}
