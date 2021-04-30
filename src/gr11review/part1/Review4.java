package gr11review.part1;

import java.io.*;
import java.text.*;

/**
* A program that takes in a list of items and outputs the following:
*   Subtotal
*   Tax
*   Total
* 
* @author: Andy Guo
*/

public class Review4 {
  public static void main(String[] args) throws IOException {
    // BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Declaring variables + initializing
    double subtotal = 0;
    double tax;
    double total;
    double itemPrice;
    int numberOfItems = 0;

    // Decimal format
    NumberFormat numberFormat = new DecimalFormat("#,##0.00");

    // Taking input for how many items
    System.out.print("How many items do you want to buy? ");
    numberOfItems = Integer.parseInt(br.readLine());

    // Loop
    for (int i = 0; i < numberOfItems; i++) {
      // Takes an item and adds it to the subtotal
      System.out.print("Enter the price for item " + (i + 1) + ": ");
      itemPrice = Double.parseDouble(br.readLine());
      subtotal += itemPrice;
    }

    // Calculates tax and total
    tax = subtotal * 0.13;
    total = subtotal + tax;

    //Output
    System.out.println("Subtotal: $" + numberFormat.format(subtotal));
    System.out.println("Tax: $" + numberFormat.format(tax));
    System.out.println("Total: $" + numberFormat.format(total));
  }
}