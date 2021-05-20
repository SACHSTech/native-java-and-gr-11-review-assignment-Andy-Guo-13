package gr11review.part1;

/**
* A program that outputs odd numbers from 20 to 100 and the numbers from 29 to 2 in descending order
* 
* @author: Andy Guo
*/

public class Review3 {
  public static void main(String[] args) {

    // First loop
    for (int i = 20; i <= 100; i++) {
      // If odd, print the number
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
    
    // Spacing in between
    System.out.println("");
    
    // Second loop
    for (int i = 29; i >= 2; i--) {
      System.out.println(i);
    }
  }
}