/*
  Programmer: Krish Patel
  Date: 08.09.2023
  Class: AP CS A
  Teacher: Dr. Savio
  Period: 5th
  Purpose: "Operators and Arithemtic Expressions Assignment"
  */

public class Main {
  public static void main(String[] args) {
        // Declare four variables in the same line. Make them type int.
    // Then, assign a value to each variable.
    // Create an example using a few of the variables to show precedence (at least one must be % [MOD])
    // Assign the answer to a 5th variable
    // Print out the String "The answer is " followed by the answer.
    // Try mixing types. Does it work? 

    int num1, num2, num3, num4;
    num1 = 2;
    num2 = 4;
    num3 = 6;
    num4 = 8;

    int num5;
    num5 = (num1 % num2) - num3*num4 + (num1 - num4);

    System.out.println("The answer is " + num5 + ".");

    // When mixing types, it did not work for me.
  }
}