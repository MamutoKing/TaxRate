import java.util.Scanner;

public class TaxRate {
    public static void main (String[] args) {

        //Create Scanner
        Scanner scnr = new Scanner(System.in);


        //Variables
        double weeklyIncome;
        double taxRate;
        double taxAmount;


        // Prompt user for Income
        System.out.println("Enter your weekly income: ");

        weeklyIncome = scnr.nextDouble();


        //If-Else tree to determine Tax Rate
        if (weeklyIncome < 500) {
            taxRate = 0.10;
        }

        else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        }

        else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        }

        else {
            taxRate = 0.30;
        }

        //Calculate tax amount
        taxAmount = weeklyIncome * taxRate;

        //Display tax amount up to two decimal places
        System.out.printf("The weekly tax withholding is: $%.2f",  taxAmount);

        scnr.close();
    }
}