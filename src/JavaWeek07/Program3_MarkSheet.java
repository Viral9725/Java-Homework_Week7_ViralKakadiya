package JavaWeek07;

import java.util.Scanner;

/*
**3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 | | Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________
* *
 */
public class Program3_MarkSheet {
    public static void main(String[] args) {
        String studentName, result, grade;
        int rollNo, maths, english, science, total, percentage;

        Scanner sn = new Scanner(System.in);
        System.out.print("Student Name:");
        studentName = sn.next();

        System.out.print("Roll_no:");
        rollNo = sn.nextInt();

        //Logic of Program for Mark sheet
        System.out.print("Maths Marks:");
        maths = sn.nextInt();
        if (maths < 0 || maths > 100)
        {
            System.out.println("invalid input because marks should be in between 0 to 100.");
            System.out.println("Please Enter Valid marks::");
            maths = sn.nextInt();
        }

        System.out.println("Science marks::");
        science = sn.nextInt();
        if (science < 0 || science > 100)
        {
            System.out.println("invalid input because marks should be in between 0 to 100.");
            System.out.println("Please Enter Valid marks::");
            science = sn.nextInt();
        }

        System.out.println("English marks::");
        english = sn.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("invalid input because marks should be in between 0 to 100.");
            System.out.println("Please Enter Valid marks::");
            english = sn.nextInt();
        }

        total = sum(maths, science, english);
        percentage = (total * 100) / 300;
        result = result(maths, science, english);
        grade = calculated(percentage, result);

        printMarkSheet(studentName, rollNo, maths, science, english, total, percentage, result, grade);
        sn.close();
    }

    //PrintmarkSheet Function with Arguments for Marksheet Logic
    public static void printMarkSheet(String studentName, int rollNo, int maths, int science, int english, int total, int percentage, String result, String grade) {
        System.out.println("______________________________________________");
        System.out.println("|                                             |");
        System.out.println("|             Mark Sheet                      |");
        System.out.println("|_____________________________________________|");
        System.out.println("| Name                : " + studentName +     "|");
        System.out.println("| Roll No             : " + rollNo +          "|");
        System.out.println("|______________________________________________|");
        System.out.println("| Subject              :  Marks                |");
        System.out.println("|______________________________________________|");
        System.out.println("| Maths                : " + maths +          "|");
        System.out.println("| Science              : " + science +        "|");
        System.out.println("| English              : " + english +        "|");
        System.out.println("|______________________________________________|");
        System.out.println("| Total                : " + total +          "|");
        System.out.println("|______________________________________________|");
        System.out.println("| Percentage           : " + percentage +     "|");
        System.out.println("| Result               : " + result +         "|");
        System.out.println("| Grade                : " + grade +          "|");
    }

    //sum function for calculation of marks
    public static int sum(int maths, int science, int english)
    {
        return maths + science + english;
    }

    //Result method for Finding Result
    public static String result(int maths, int science, int english)
    {
        if (maths < 35 ||  science < 35 || english < 35)
        {
            return "Fail";
        }
        else
        {
            return "Pass";
        }
    }
    //Calculated method for Find Grade
    public static String calculated(int percentage, String result)
    {
        String grade = null;

        if (percentage >= 80)
        {
            grade = "A+";
        }
        else if (percentage >= 60)
        {
            grade = "A";
        }
        else if (percentage >= 50)
        {
            grade = "B";
        }
        else if (percentage >= 35 )
        {
            grade = "C";
        }
        else
        {
            grade = "Fail";
        }
        return grade;
    }

}
