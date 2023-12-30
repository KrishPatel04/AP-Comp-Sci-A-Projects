import java.util.Scanner;
/* Programmers: Krish Patel & Kenwin Hayes
  Period: 5
  Scanner Excerise
  08.17.2023
  */

public class Main {
  public static void main(String[] args) {

		//Declaring the scanner
		Scanner s = new Scanner(System.in);

		//Getting the user name
    System.out.print("What is your name? ");
    String userName = s.nextLine();

    //Getting the user price per gallon
		System.out.print("What is the price per gallon? ");
		double pricePerGallon = s.nextDouble();

		//Getting the user's total price for fillup
    System.out.print("What is the total amount you paid to fill up gas? ");
    double totalAmount = s.nextDouble();

		//Finding the inital and final odometer value
    System.out.print("What is the initial odometer value? ");
    int initialOdometerValue = s.nextInt();

		System.out.print("What is the final odometer value? ");
		int finalOdometerValue = s.nextInt();

		//Calculating distance traveled
		int distanceTraveled = finalOdometerValue - initialOdometerValue;

		//Calulating gallons used
		double gallonsUsed = totalAmount/pricePerGallon;

		//Calculating miles per gallon
		double milesPerGallon = distanceTraveled/gallonsUsed;

		//Final message
    System.out.println("\n" + userName + ", you drove " + distanceTraveled + " miles using " + gallonsUsed + " gallons with a mpg of " + milesPerGallon);
  }
}