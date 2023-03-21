package JavaWeek07;

import java.util.Scanner;

/*
**12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12_UserInputNumberOrAlphatics
{
    //Main method
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Number::");
        char input_char  = sn.next().charAt(0);

        charCheck(input_char);

        sn.close();
    }

    //charCheck method for if_elseif Condition Logic
    static void charCheck(char input_char)
    {
        // CHECKING FOR ALPHABET
        if ((input_char >= 'a' && input_char <= 'z') || (input_char >= 'A' && input_char <= 'Z'))
        {
            System.out.println(input_char+"Number You Entered is Alphabet");
        }
            // CHECKING FOR DIGITS
        else if (input_char >= '0' && input_char <= '9')
        {
            System.out.println(input_char+"Number You Entered is Digit");
        }
        // OTHERWISE SPECIAL CHARACTER
        else
        {
            System.out.println(input_char+"Number You Entered is Special Character");
        }
    }
}
