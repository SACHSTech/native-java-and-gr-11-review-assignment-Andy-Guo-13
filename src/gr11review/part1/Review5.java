package gr11review.part1;

import java.io.*;

/*
Compile command:
javac -d bin src/gr11review/part1/Review5.java

Run command:
java -classpath bin gr11review.part1.Review5
*/

/*
Compile and running tests:
javac -d bin src/gr11review/part1/Review5.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review5Test.java

java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review5Test
*/

/**
* A program that outputs the amount of years it will take to reach a target amount of money when given the following:
*   Yearly amount invested
*   Target amount
*   Compound interst rate
* 
* @author: Andy Guo
*/

public class Review5 {
  public static void main(String[] args) throws IOException{
    // BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Declaring variables + initializing 
    double yearlyAmount;
    double interestRate;
    double targetAmount;
    int years = 0;
    double annualGrowth;
    double total = 0;

    // Taking inputs
    System.out.print("Enter the yearly invested amount: ");
    yearlyAmount = Double.parseDouble(br.readLine());
    System.out.print("Enter the compound interest rate: ");
    interestRate = Double.parseDouble(br.readLine());
    System.out.print("Enter the target amount: ");
    targetAmount = Double.parseDouble(br.readLine());

    // Converting percent to decimals
    annualGrowth = interestRate/100d + 1d;
    
    // Loop
    while (total < targetAmount) {

      // Adds the amount of years and yearly amount into total
      years++;
      total += yearlyAmount;
      
      //Compounding interest
      total *= annualGrowth;
    }

    // Output
    System.out.println("The target amount will be earned in " + years + " years.");

  }
}