/*
 * Chase Moore
 * 1/30/19
 * This program calculates the tax of a purchase
 */
package inclass_04_moorechase;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InClass_04_MooreChase {


    public static void main(String[] args) {
       
        //Declare variables
        int Amount;
        int stateTax;
        int countyTax;
        int totalTax;
        int totalPrice;
        
        //Declare constants for the state and county tax rates
        final double STATE_TAX_RATE = 0.04;
        final  double COUNTY_TAX_RATE = 0.02;
        
        //Create scanner to read input
        Scanner Keyboard = new Scanner(System.in);
        
        //Get the amount of the purchase
        System.out.print("Amount of purchase?");
        Amount = Keyboard.nextInt();
        
        //Calculate the state tax
        stateTax = (int) (STATE_TAX_RATE * Amount);
        
        //Calculate the county tax
        countyTax = (int) (COUNTY_TAX_RATE * Amount);
        
        //Calculate the total tax
        totalTax = (int) (stateTax + countyTax);
        
        //Calculate the total price
        totalPrice = (int) (stateTax + countyTax) + Amount;
        
        
        
        
        
        
        //Display ALL the information about the transaction
        System.out.println("the amount of the purchase is $" + Amount);
        System.out.println("the state tax is $" + stateTax);
        System.out.println("the county tax is $" + countyTax);
        System.out.println("the total tax is $" + totalTax);
        System.out.println("the total price is $" + totalPrice );
        System.out.printf("\n...");
        
        
        
        
        // TODO code application logic here
    }
    
}
