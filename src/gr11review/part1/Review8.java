package gr11review.part1;

/*
Compile command:
javac -d bin src/gr11review/part1/Review8.java

Run command:
java -classpath bin gr11review.part1.Review8
*/

/*
Compile and running tests:
javac -d bin src/gr11review/part1/Review8.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review8Test.java

java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review8Test
*/

/**
* A program that outputs 1000 lines of a set of 3 numbers, where each number is a random number between 0 and 8
* The program will also count and output the number of times all 3 numbers were the same
* 
* @author: Andy Guo
*/

public class Review8 {
  public static void main(String[] args) {
    // Declaring variables + initialization
    int firstNum;
    int secondNum;
    int thirdNum;
    int amountTriples = 0;

    // Loop --> 1000 times
    for (int i = 0; i < 1000; i++) {

      // Randomizing the three numbers
      firstNum = (int)(Math.random() * 9d);
      secondNum = (int)(Math.random() * 9d);
      thirdNum = (int)(Math.random() * 9d);

      // If all 3 numbers are the same, add 1 to amountTriples
      if (firstNum == secondNum && firstNum == thirdNum) {
        amountTriples++;
      }

      // Output the 3 numbers
      System.out.println(firstNum + " " + secondNum + " " + thirdNum);
    }

    // Output total number of triples
    System.out.println(amountTriples);
  }
}