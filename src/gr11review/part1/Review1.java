package gr11review.part1;

import java.io.*;

/*
Compile command:
javac -d bin src/gr11review/part1/Review1.java

Run command:
java -classpath bin gr11review.part1.Review1
*/

/*
Compile and running tests:
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review1Test.java

java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review1Test
*/

/**
* A program that takes in the month number and day number and outputs the day of the year
* 
* @author: Andy Guo
*/

public class Review1 {
  public static void main(String[] args) throws IOException {

    //BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //Declaring variables
    int monthNum;
    int dayNum;
    int[] monthArray;
    int sum;

    //Initializing variables
    monthArray = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    sum = 0;

    //Taking inputs
    System.out.print("Enter the month number: ");
    monthNum = Integer.parseInt(br.readLine());
    System.out.print("Enter the day number: ");
    dayNum = Integer.parseInt(br.readLine());
    
    //Loop - add the days of each month up until the user inputed month
    for (int i = 0; i < monthNum; i++) {
      sum += monthArray[i];
    }

    //Add day of month to total sum
    sum += dayNum;

    //Output
    System.out.println(sum);
  }
}