package gr11review.part1;

import java.io.*;

/**
* A program that takes in the month number and day number and outputs the day of the year
* 
* @author: Andy Guo
*/

public class Review1 {
  public static void main(String[] args) throws IOException {

    // BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Declaring variables
    int monthNum;
    int dayNum;
    int[] monthArray;
    int sum;

    // Initializing variables
    monthArray = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    sum = 0;

    // Taking inputs
    System.out.print("Enter the month number: ");
    monthNum = Integer.parseInt(br.readLine());
    System.out.print("Enter the day number: ");
    dayNum = Integer.parseInt(br.readLine());
    
    // Loop - add the days of each month up until the user inputed month
    for (int i = 0; i < monthNum - 1; i++) {
      sum += monthArray[i];
    }

    // Add day of month to total sum
    sum += dayNum;

    // Output
    System.out.println(sum);
  }
}