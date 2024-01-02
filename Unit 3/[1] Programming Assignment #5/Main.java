/** Group members: Krish Patel, Kenwin Hayes, Brian Zhou, Alberto Garcia 
  Programming Task #5
  Date: 09.28.2023
  Period 5
  Teacher: Dr. Savio
  Class: AP Computer Science A
  */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    printSinTable();
    
    Scanner input = new Scanner(System.in);

		//Initializing the target number
    System.out.print("Please enter the target number: ");
    int targetNumber = input.nextInt();
    int targetNumberCount = 0;

		// Creating variables to print data about the inputed numbers
    int sum = 0, count = 0, oddNumberCount = 0, value;
    int maxValue = 0;
    
    String msg = "Enter an integer value (0 to quit): ";

    do {
			//Collecting the data as long as the user doesn't enter 0
      System.out.print(msg);
      
      value = input.nextInt();
      sum += value;
    
      if (value != 0) {count++;}
    
      if (value % 2 != 0) {oddNumberCount++;}

      if (value == targetNumber) { targetNumberCount++; }

      maxValue = Math.max(maxValue, value);
        
      msg = "Enter the next integer value (0 to quit): ";
    }
    while (value != 0);

		//Print out the resultant data
    System.out.println("The sum of the entered values is " + sum);
    
    System.out.println("The number of non-zero values that were entered is " + count);

    if (count != 0) {
      double average = (double) sum / count;
      System.out.println("The average of these non-zero values entered is " + average);
    }

    System.out.println("The number of non-zero odd values that were entered is " + oddNumberCount);

    System.out.println("The value " + targetNumber + " was inputted " + targetNumberCount + " time(s)");
    System.out.println("The maximum value entered was " + maxValue);

    input.close();
		//End of 
  }

  public static void printSinTable() {
    /**
     * Compares the values of a custom made sin method verses the Math.sin method
     * @author Brian Zhou
     */
    final int START = -1;
    final int END = 1;
    final double INCREMENT = 0.01;
    System.out.println("Sin table:");
    
    // printing the headers
    System.out.println("x                     sin(x)                Math.sin(x)           Absolute Value of Difference");

    // start from START and end at END, incrementing by INCREMENT
    for (double x = START; x < END + INCREMENT; x += INCREMENT) {
      
      // calculate the value from the custom made sin function
      double mySin = sin(x);

      // calculate the value from the Math.sin function
      double mathSin = Math.sin(x);
      
      // print the formatted result
      System.out.printf("%-21s %-21s %-21s %s\n", x, mySin, mathSin, Math.abs(mySin - mathSin));
    }
  }
  
  public static double sin(double x) {
    /**
     * Calculates sin, increase the number of terms to make the calculation more accurate
     * @author Brian Zhou
     */
    final int TERMS = 17;
    double sum = 0;

    long factorial = 1;

    // add the result of each term to sum
    for (int n = 0; n < TERMS; n++) {
      if (n > 0) { 
        factorial *= 2 * n * (2 * n + 1); 
      }
      // System.out.println(factorial);
      
      sum += pow(-1, n) * pow(x, 2 * n + 1) / factorial;
    }
    
    return sum;
  }
  
  public static double pow(double base, int power) {
    /**
     * Implements the square multiply algorithm for exponentiation
     * @author Brian Zhou
     */
    if (power < 0) {
      throw new IllegalArgumentException("Negative powers are not supported");
    }
    
    double currentValue = 1;

    // finding the binary representation of the power
    String powerBinaryRep = Integer.toBinaryString(power);
    int stringLen = powerBinaryRep.length();

    // looping for each character in the string representing the power in binary
    for (int i = 0; i < stringLen; i++) {
      // always square the current value
      currentValue *= currentValue;

      // multiply only by the base if the current character is equal to 1
      if (powerBinaryRep.charAt(i) == '1') {
        currentValue *= base;
      }
    }
    
    return currentValue;
  }
}