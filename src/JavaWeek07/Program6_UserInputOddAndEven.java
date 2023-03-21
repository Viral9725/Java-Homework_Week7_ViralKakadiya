package JavaWeek07;

import java.util.Scanner;

/*
 **6. Write a java program to input any number and find out if it’s odd or even
 */
public class Program6_UserInputOddAndEven {
    public static void main(String[] args) {
        int a;

        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        a = sn.nextInt();

        //Main Logic of the Program with If_Else Condition
        if(a%2==0)
        {
            System.out.println(a+" number is even.");
        } else {
            System.out.println(a+"number is odd.");
        }

        sn.close();
    }

}
