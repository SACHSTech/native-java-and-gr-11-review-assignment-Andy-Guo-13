package gr11review.part1;

import java.io.*;

/*
Compile command:
javac -d bin src/gr11review/part1/Review7.java

Run command:
java -classpath bin gr11review.part1.Review7
*/

/*
Compile and running tests:
javac -d bin src/gr11review/part1/Review7.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review7Test.java

java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review7Test
*/

/**
* A program that takes a string and outputs the following:
*   The number of characters
*   The number of spaces
*   The number of letters
*   A string with the odd numbered characters
* @author: Andy Guo
*/

public class Review7 {
  public static void main(String[] args) throws IOException{
    //BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //Declaring + initializing variables
    String inputSentence;
    String[] sentenceCharacter;
    String oddCharacter = "";
    int characterNum = 0;
    int spaceNum = 0;
    int letterANum = 0;

    //Taking input
    inputSentence = br.readLine();

    //Converting input into an array
    sentenceCharacter = inputSentence.split("");
    
    //Loop - for every character within the array
    for (String i : sentenceCharacter) {
      //Count the character number
      characterNum++;

      //If character number is odd, add to the string
      if (characterNum % 2 == 1) {
        oddCharacter += i;
      }
      
      //If the character is a space, add to spaceNum
      if (i.equals(" ")) {
        spaceNum++;
      }

      //If the character is an "a", add to letterANum
      if (i.equals("a")) {
        letterANum++;
      }
    }

    //Output
    System.out.println("There are " + characterNum + " characters in the sentence.");
    System.out.println("There are " + spaceNum + " spaces in the sentence.");
    System.out.println("There are " + letterANum + " letter a in the sentence.");
    System.out.println(oddCharacter);
  }
}

//Question: what are the specifics of the outputs?
//Question: do upper case "A"s count?