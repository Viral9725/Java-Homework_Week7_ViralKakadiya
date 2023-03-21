package JavaWeek07;

/*
**19. Write a Java program to calculate the average value of array elements.
 */
public class Program19_CalculateAvgOfArray
{
    //main method for program
    public static void main(String[] args)
    {
        int arr[] = {10, 10, 15, 20, 20};
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of array values::" + sum);

        //Average of 5 Arrays
        int avg=sum/5;
        System.out.println("Average of 5 Arrays::"+avg);

    }
}
