/*
 * Chase moore
 * 1/30/19
 * This program calculates pay rate using JOptionPane
 */

package inclass_05_moorechase;
import javax.swing.JOptionPane;

/**
 *
 * @author moorec5415
 */
public class InClass_05_MooreChase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputString;
        String name;
        int hours;
        double payRate;
        double grossPay;
        
        //get the users name. 
        name = JOptionPane.showInputDialog ("what is " + "your name? ");
        
        //get the hours worked
        inputString =
                JOptionPane.showInputDialog("How many hours "+ "did you work this week?");
        
        //Convert the input to an int.
        hours = Integer.parseInt(inputString);
        
        //Get hourly pay rate.
        inputString = 
                JOptionPane.showInputDialog("What is your " + "hourly pay rate? ");
        
        // Convert the input to a double.
        payRate = Double.parseDouble(inputString);
        
        // Calculate the goss pay.
        grossPay = hours * payRate;
        
        // Display the results.
        JOptionPane.showMessageDialog(null, "Hello "+ name +". Your gross pay is $" + grossPay);
        
        // End the program
        System.exit(0);
        // TODO code application logic here
    }
    
}
