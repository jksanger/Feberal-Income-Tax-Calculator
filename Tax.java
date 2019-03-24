package project1tax;

/**
 *
 * @author Joseph Sanger 1527317
 * CS 55 1722
 * Project 1 Tax
 * 
 * This program will accept input from the user and compute their income
 * tax based on their filing status for 2009 U.S. Federal Personal Tax Rates
 */

import java.util.Scanner;

public class Project1Tax {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int status = 0; //filing status
    float taxrate = 0; // tax rate
    float income = 0; // income amount
    float tax = 0; // amount of tax due
    
    Scanner scan = new Scanner(System.in);
    
    // Display the options
    System.out.println("Enter filing status: ");
    System.out.println("Enter 0 for Single");
    System.out.println("Enter 1 for Filing Jointly");
    System.out.println("Enter 2 for Married Filing Separately");
    System.out.println("Enter 3 for Head of Household");
        
    status = scan.nextInt(); // scans user input for filing status
        
    System.out.println("Enter taxable income: ");
    
    income = scan.nextFloat(); // scans user input for income
    
    switch (status) // Switch Menu, will asses the users input and calculate the tax
        // This will add to the tax variable depending on income and tax rate.
        // If the income is in a higher tax bracket it will calcualte the new amount
        // and add it to the tax variable accordingly
    {
        case 0 : // For single filer rates
            
            // Taxes this bracket at 10%
		tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10; 
                // If the income is over 8350, then it will take the income, subtract
                // the 8350, and multiply the remainder by the new tax rate and add
                //  the result to the tax varible
                    if (income > 8350)
			tax += (income <= 33950) ? (income - 8350) * 0.15 :
                            25600 * 0.15;
                    if (income > 33950)
			tax += (income <= 82250) ? (income - 33950) * 0.25 :
                            48300 * 0.25;
                    if (income > 82250)
			tax += (income <= 171550) ? (income - 82250) * 0.28 :
                            89300 * 0.28;
                    if (income > 171550)
                        tax += (income <= 372950) ? (income - 171550) * 0.33 :
                            201400 * 0.33;
                    if (income > 372950)
			tax += (income - 372950) * 0.35;
                    break; // stops the program
        case 1 : // For joint filer rates)
		tax += (income <= 16700) ? income * 0.10 : 16700 * 0.10;
                    if (income > 16700)
			tax += (income <= 67900) ? (income - 16700) * 0.15 :
                            (67900 - 16700) * 0.15;
                    if (income > 67900)
			tax += (income <= 137050) ? (income - 67900) * 0.25 :
                            (137050 - 67900) * 0.25;
                    if (income > 137050)
                        tax += (income <= 208850) ? (income - 137050) * 0.28 :
                            (208850 - 137050) * 0.28;
                    if (income > 208850)
			tax += (income <= 372950) ? (income - 208850) * 0.33 :
                            (372950 - 208850) * 0.33;
                    if (income > 372950)
                        tax += (income - 372950) * 0.35;
                    break;
        case 2 : // for filing separatley rates
		tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
                    if (income > 8350)
			tax += (income <= 33950) ? (income - 8350) * 0.15 :
                            (33950 - 8350) * 0.15;
                    if (income > 33950)
			tax += (income <= 68525) ? (income - 33950) * 0.25 :
                            (68525 - 33950) * 0.25;
                    if (income > 68525)
			tax += (income <= 104425) ? (income - 68525) * 0.28 :
                            (104425 - 68525) * 0.28;
                    if (income > 104425)
			tax += (income <= 186475) ? (income - 104425) * 0.33 :
                            (186475 - 104425) * 0.33;
                    if (income > 186475)
			tax += (income - 186475) * 0.35;
                    break;
        case 3 : // for head of household rates
                tax += (income <= 11950) ? income * 0.10 : 11950 * 0.10;
                    if (income > 11950)
                        tax += (income <= 45500) ? (income - 11950) * 0.15 :
                            (45500 - 11950) * 0.15;
                    if (income > 45500)
			tax += (income <= 117450) ? (income - 45500) * 0.25 :
                            (117450 - 45500) * 0.25;
                    if (income > 117450)
			tax += (income <= 190200) ? (income - 117450) * 0.28 :
                	    (190200 - 117450) * 0.28;
                    if (income > 190200)
			tax += (income <= 372950) ? (income - 190200) * 0.33 :
                            (372950 - 190200) * 0.33;
                    if (income > 372950)
			tax += (income - 372950) * 0.35;
                    break;
        
        // if the user enters an incorrect case, it will send a message and end the program            
        default : System.out.println("Error: invalid filing status");
               	System.exit(1);
    }
    // Displays the income tax owed
		System.out.println("Tax income tax is " + (int)(tax * 100) / 100.0);
    }
}
