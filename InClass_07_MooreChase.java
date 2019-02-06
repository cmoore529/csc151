/*
Chase Moore
1/30/19
This program calculates the price per guest
*/

package InClass_07_MooreChase;


import java.util.Scanner;

public class InClass_07_MooreChase {

   public static void main(String[] args) {
      final double TAX = 0.07;
      final double GUEST_PRICE = 35.00;
      double price;
      double priceTax;
      int guests;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      
      System.out.println("***************************************************");
      System.out.println("*                                                 *");
      System.out.println("*  Jim's food makes the party great.              *");
      System.out.println("*                                                 *");
      System.out.println("***************************************************");
      price = guests * GUEST_PRICE;
      priceTax = price / TAX;
      
      System.out.println("The price for an event with " + guests);
      System.out.println(" guests at $" + GUEST_PRICE + " per guest is $" + price);
      System.out.println("The price including tax with " + guests + " guests is $ " + priceTax);
   }
}


