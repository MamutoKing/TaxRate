import java.util.Scanner;
import java.util.InputMismatchException;

public class TaxRate {
    public static void main (String[] args) {

        //Create Scanner
        Scanner scnr = new Scanner(System.in);


        //Variables
        double weeklyIncome;
        double taxRate = 0;
        double taxAmount;
        int bracket;

        try{
        // Prompt user for Income
            System.out.println("Enter your weekly income: ");

            weeklyIncome = scnr.nextDouble();

        //Throw for invalid (negative) income
            if (weeklyIncome < 0) {
                throw new IllegalArgumentException ("income cannot be negative.");
            }

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
        }

        catch (inputMismatchException e){
            System.out.println ("Error: Please enter a valid numeric value for income.");
        }

        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            scnr.close();
            System.out.println("Program closed.");
        }
    }
}