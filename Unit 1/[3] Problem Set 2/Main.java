/*
 * Programmer: Krish Patel
 * Date: 08.09.2023
 * Class: AP CS A
 * Teacher: Dr. Savio
 * Period: 5th
 * Purpose: Demonstrate Unit 1 Knowledge through Small Programs
 */

public class Main {
    public static void main(String[] args) {
      /*
       * Problem 0: Initialize an appropriate set of variables for calculating the
       * area of a circle (Remember, this is πr^2). You may use the value 3.14 for π
       * and choose any radius. Your code should then use those variables to actually
       * calculate the area of the circle and store it in a variable with appropriate
       * name and type, then print its value.
       */

      System.out.println("\n[Problem 0]:\n");

      final double PI = 3.14;
      int radius = 2;

      double circleArea = PI * radius * radius;

      System.out.println("The area of a circle with a radius of " + radius + " is " + circleArea + ".");

      System.out.println("\n*********************************************************\n");
      /*
       * Problem 1: Your weight is actually the amount of gravitational attraction
       * exerted on you by the earth. Since the moon’s gravity is only 1/6 of the
       * earth’s, on the moon you would weigh 1/6 of what you weigh on earth.
       * Write an application that given a weight on earth, their weight on Mercury,
       * Venus, Jupiter and Saturn is output
       * 
       * Planet Multiply the Earth weight by
       * Mercury 0.4
       * Venus 0.9
       * Jupiter 2.5
       * Saturn 1.1
       */

      System.out.println("[Problem 1]:\n");

      final double MY_WEIGHT = 10.0;

      double mercuryConversionFactor = 0.4;
      double venusConversionFactor = 0.9;
      double jupiterConversionFactor = 2.5;
      double saturnConversionFactor = 1.1;

      double myMercuryWeight = MY_WEIGHT * mercuryConversionFactor;
      double myVenusWeight = MY_WEIGHT * venusConversionFactor;
      double myJupiterWeight = MY_WEIGHT * jupiterConversionFactor;
      double mySaturnWeight = MY_WEIGHT * saturnConversionFactor;

      System.out.println("If your weight on Earth were to be " + MY_WEIGHT + " kgs, then your weight on... ");
      System.out.println("- Mercury would be " + myMercuryWeight + " kgs");
      System.out.println("- Venus would be " + myVenusWeight + " kgs");
      System.out.println("- Jupiter would be " + myJupiterWeight + " kgs");
      System.out.println("- Saturn would be " + mySaturnWeight + " kgs");

      System.out.println("\n*********************************************************\n");
      /*
       * Problem 2: Write a program that starts with seconds and then displays that
       * value converted to full hours, minutes and seconds. (You should understand
       * and think about your algorithm to accomplish this prior to starting the
       * coding. It helps to work through the problem on paper first as this may
       * clarify the steps you need to code in your program.)
       */

      System.out.println("[Problem 2]:\n");
      
      final int TOTAL_NUMBER_OF_SECONDS = 3603;

      int hours = TOTAL_NUMBER_OF_SECONDS / 3600;

      int secondsRemaining = TOTAL_NUMBER_OF_SECONDS % 60;

      int minutes = secondsRemaining / 60;
      int seconds = secondsRemaining % 60;

      System.out.println(TOTAL_NUMBER_OF_SECONDS + " seconds in hours, minutes, and seconds format is... ");
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);

      System.out.println("\n*********************************************************\n");

      /*
       * CHALLENGE* Problem #3
       * Write a program which takes a three digit number, then prints the digits of
       * this number one per line in reverse order. Use multiple variables to let you
       * store digits and intermediate results you need.
       * 
       * Sample run:
       * The digits are:
       * 678
       * 
       * Here are the digits:
       * 8
       * 7
       * 6
       */

      System.out.println("[Problem 3]:\n");
      
      final int THREE_DIGIT_NUMBER = 251;

      int hundredsPlace = THREE_DIGIT_NUMBER / 100;
      int tensAndOnesPlace = THREE_DIGIT_NUMBER % 100;

      int tensPlace = tensAndOnesPlace / 10;
      int onesPlace = tensAndOnesPlace % 10;

      System.out.println("If you had the number " + THREE_DIGIT_NUMBER + ", the that number reserved displayed on different lines would be... ");
      System.out.println(onesPlace);
      System.out.println(tensPlace);
      System.out.println(hundredsPlace);

      System.out.println("\n*********************************************************\n");

      System.out.println("Thank you."); // from Dr. S: you are welcome! Nice job!

    }
}