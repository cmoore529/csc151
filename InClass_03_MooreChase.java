/*
 * Chase Moore
 * 01/23/19
 * This program calculates gross pay without user input.
 */
package InClass_03_MooreChase;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InClass_03_MooreChase {
   

    public static void main(String[] args) 
    {
        String name;
        int hours = 40;
        double payRate = 20.0;
        double grossPay = 0.0;
        
        // Create a Scanner object to read input.
        Scanner Keyboard = new Scanner(System.in);
        
        // Get the user's name.
        System.out.print("What is your name?");
        name = Keyboard.nextLine();
        
        // Get the number of hours worked this week.
        System.out.print("How many hours did you work this week?");
        hours = Keyboard.nextInt();
        
        // Get the user's hourly pay rate.
        System.out.print("What is your hourly pay rate? ");
        payRate = Keyboard.nextDouble();
        
        // Calculate the gross pay
        grossPay = hours * payRate;
        
        // Display the resulting information
        System.out.println("Hello, " + name);
        System.out.printf("Your gross pay is $%,.2f",grossPay);
        System.out.printf("\n...");
        
        
        // TODO code application logic here
    }
    
}
