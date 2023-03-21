package JavaWeek07;

import java.util.Arrays;

/*
**17. Write a Java program to sort a numeric array and a string array
 */
public class Program17_SortNumericArrayAndStringArray
{
    //main method for program
    public static void main(String[] args)
    {
        int my_array1[] = {10, 20, 5, 4, 8};
        String[] my_array2 = {"Mahesh", "Arvind", "Viral"};

        //main Logic for Sort Array1 and Array2
        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));

    }
}
