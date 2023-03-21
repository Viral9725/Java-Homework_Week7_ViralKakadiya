package JavaWeek07;

import java.util.Scanner;

/*
**7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Program7_SalaryAndCommision
{
    public static void main(String[] args)
    {
        String salesId,sellerName;
        double salesAmount,salaryBasic,commissionRate;
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter sales ID: ");
        salesId = sn.next();

        System.out.print("Enter seller's name: ");
        sellerName = sn.next();

        System.out.print("Enter sales amount: ");
        salesAmount = sn.nextDouble();

        System.out.print("Enter salary basic: ");
        salaryBasic = sn.nextDouble();

        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.2;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.1;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        double commission = salesAmount * commissionRate;


        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Commission: " + commission);

        double total = salaryBasic + commission;
        System.out.println("Total Salary Overall: " + total);

        sn.close();
    }
}
