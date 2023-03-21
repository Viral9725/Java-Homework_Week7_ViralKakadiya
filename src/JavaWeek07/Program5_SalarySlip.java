package JavaWeek07;

import java.util.Scanner;

/*
**5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 */
public class Program5_SalarySlip
{
        //main Method
    public static void main(String[] args)
    {
            String employeeName;
            double employeeId,basicSalary;
            double HRA;
            double TA;
            double DA;
            double PF;

            Scanner sn = new Scanner(System.in);

            System.out.print("Enter Employee ID: ");
            employeeId = sn.nextDouble();

            System.out.print("Enter Employee name: ");
            employeeName = sn.next();

            System.out.print("Enter basic salary: ");
            basicSalary = sn.nextDouble();

            //Program main Logic For Gross Salary
            HRA = (basicSalary * 10)/100;
            TA  = (basicSalary * 9)/100;
            DA  = (basicSalary * 8)/100;
            PF  = (basicSalary * 20)/100;


            double GrossSalary = (basicSalary + HRA + TA + DA) - PF;

            System.out.println(" ___________________________________________________");
            System.out.println("|                    Salary Slip                    |");
            System.out.println("|___________________________________________________|");
            System.out.println("|Basic salary                      :|"+basicSalary+"|");
            System.out.println("|HRA                               :|"        +HRA+"|");
            System.out.println("|TA                                :|"         +TA+"|");
            System.out.println("|DA                                :|"         +DA+"|");
            System.out.println("|PF                                :|"         +PF+"|");
            System.out.println("|____________________________________________________");
            System.out.println("|Gross Salary                    :|"   +GrossSalary+"|");
            System.out.println("|===================================================|");

            sn.close();
    }
}

