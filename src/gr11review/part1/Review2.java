package gr11review.part1;

import java.io.*;

/*
Compile command:
javac -d bin src/gr11review/part1/Review2.java

Run command:
java -classpath bin gr11review.part1.Review2
*/

/*
Compile and running tests:
javac -d bin src/gr11review/part1/Review2.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review2Test.java

java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review2Test
*/

/**
* A program that outputs a joke based on the option the user picks
* 
* @author: Andy Guo
*/

public class Review2 {
  public static void main(String[] args) throws IOException {
    // BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Declaring variables
    int menuOption;

    // Giving instructions + taking input
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");
    System.out.print("Choose a menu option: ");
    menuOption = Integer.parseInt(br.readLine());

    // Depending on the option the user chooses, it outputs differently
    if (menuOption == 0) {
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
    } else if (menuOption == 1) {
      System.out.println("What can you say about your feet and your nose?");
      System.out.println("They both smell.");
    } else if (menuOption == 2) {
      System.out.println("What is a poorly dressed dinosaur called?");
      System.out.println("An eye-saur.");      
    } else if (menuOption == 3) {
      System.out.println("What's the Difference Between a Teacher and a Train?");
      System.out.println("The teacher says ''Spit your gum out'' and the train says, ''Chew, chew!''");
    } else {
      // If the user doesn't select one of the options
      System.out.println("Invalid menu option");
    }
  }
}