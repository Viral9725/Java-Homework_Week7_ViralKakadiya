package JavaWeek07;

/*
**18. Write a Java program to sum values of an array
 */
public class Program18_SumValueofArray
{
    //main method for program
    public static void main(String[] args)
    {
        int arr[] = {5, 10, 15, 20, 25};
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of array values: " + sum);

    }
}
