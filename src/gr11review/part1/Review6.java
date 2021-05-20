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

public class Review6 {
  public static void main(String[] args) throws IOException {
    // BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Declaring variables + initializing
    double subtotal = 0;
    double tax;
    double total;
    double itemPrice = -1d;
    int numberOfItems = 0;

    // Decimal format
    NumberFormat numberFormat = new DecimalFormat("#,##0.00");

    // Loop
    while (itemPrice != 0) {
      // Takes an item and adds it to the subtotal
      System.out.print("Enter the price for an item: ");
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