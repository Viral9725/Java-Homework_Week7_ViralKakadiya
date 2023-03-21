package JavaWeek07;

import java.util.Arrays;
import java.util.Scanner;

/*
**20. Write a Java program to test if an array contains a specific value.
 */
public class Program20_ArrayContainsValidData
{
    //main method for program
    public static void main(String[] args)
    {
        String[] strings = {"Mahesh","Raju","Hemal"};

        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Your Name::");
        String toFind  = sn.next();

        //Program Logic for Finding Array data
            boolean data = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

            if (data)
            {
                System.out.println(toFind + " is found.");
                System.out.println("Entered Data is Available::"+strings[0]+ " && " +strings[1]+ " && " +strings[2]);
            }
            else
            {
                System.out.println("Data not Found,Please Enter different Name::"+toFind);
            }
            sn.close();
    }
}