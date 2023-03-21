package JavaWeek07;

import java.util.Scanner;

/*
**10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */
public class Program10_UserInputForMaths
{
    //main method
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter First Number:");
        int a = sn.nextInt();
        System.out.println("Please Enter Second Number:");
        int b = sn.nextInt();

        System.out.println("Please Enter Your Choice Symbol (+, -, *, /, %) ::");

        char op = sn.next().charAt(0);
        logical(a, b, op);

        sn.close();
    }

    //Logical Method for if else condition
    public static int logical(int a, int b, char op)
    {
        int ans = 0;

        if (op == '+') {
            ans = a + b;
        }
        else if (op == '-')
        {
            ans = a - b;
        }
        else if (op == '/') {
            ans = a / b;
        }
        else if (op == '*') {
            ans = a * b;
        }
        else
        {
            System.out.println("Entered Operand is Invalid");
        }
        System.out.println("Your answer is - " + ans);
        return ans;
    }
}