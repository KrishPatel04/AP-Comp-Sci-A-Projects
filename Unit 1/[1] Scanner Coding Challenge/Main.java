import java.util.Scanner;

/*
  * Programmer: Krish Patel
  * Date: 08.17.2023
  * Class: AP CS A
  * Teacher: Dr. Savio
  * Period: 5th
  * Purpose: Kinematics + Time Calculator [Demonstrating Scanner Knowledge through Challenge Progreams]
  */

class Main {
  public static void main(String[] args) {

    // Challenge 1---------------------------------
    // This program calculates the time and final velocity of a falling cow based on
    // user input

    // Constants
    final double GRAVITY = 9.81;

    // Create a scanner
    Scanner s = new Scanner(System.in);

    // Ask the user for the height of the mountain
    System.out.print("\nWhat is the height of the mountain (in meters)? ");

    // Store the response in 'height'
    int height = s.nextInt();

    // Math time
    double time = Math.sqrt(height * 2 / GRAVITY);
    double finalVelocity = GRAVITY * time;

    System.out.println("------------------------------------");

    // Print out the results
    System.out.println("Time to reach ground (s): " + time);
    System.out.println("Final velocity (m/s): " + finalVelocity);

    // Challenge 2-------------------------------------
    // This program calculates the time it takes to manufacture
    // some cookies

    // Welcome message

    Scanner k = new Scanner(System.in);
    System.out.println(
        "\n\n-------------------------------------------\n\nWelcome to Nabisco's Oreo Manufracturing Planning Center.");

    // Ask the user factory name
    System.out.print("Factory Name: ");
    String factoryName = k.nextLine();

    // Ask the user factory location
    System.out.print("Factory Location: ");
    String factoryLocation = k.nextLine();

    // Ask the user for number of oreos
    System.out.print("Please enter the number of Oreos to make: ");
    long numberOfCookies = k.nextLong();

    // the cookies produced per second
    double cookiesPerSecond = 1874.5;

    // figuring out how many seconds we need to make all these cookies
    long totalSeconds = Math.round(numberOfCookies / cookiesPerSecond);

    // calculating years
    int years = (int) (totalSeconds / 31536000);
    int leftOverYears = (int) (totalSeconds % 31536000);

    // calculating days
    int days = leftOverYears / 86400;
    int leftOverDays = leftOverYears % 86400;

    // calculating hours
    int hours = leftOverDays / 3600;
    int leftOverHours = leftOverDays % 3600;

    // calculating minutes and seconds
    int minutes = leftOverHours / 60;
    int seconds = leftOverHours % 60;

    // Print the final result
    System.out.println("Time required: ");
    System.out.println(
        years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

    System.out.println("\n\nThank you for joining us on this edition of AP CS A! We hope to see ya again! 🙃");

  }
}