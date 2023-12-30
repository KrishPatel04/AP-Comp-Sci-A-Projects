// Programmers: Kenwin Hayes & Krish Patel
// Teacher: Dr. Savio
// Period 5
// 08.10.2023
// Purpose: Return the exact change of coins

public class Main {

	public static void main(String[] args) {

		int totalCents = 86;

		int quarters = totalCents / 25;
		int remainderQ = totalCents % 25;

		int dimes = (remainderQ / 10);
		int remainderD = (remainderQ % 10);

		int nickels = (remainderD / 5);
		int remainderN = (remainderD % 5);

		int pennies = remainderN;

		System.out.println(
				quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + ", pennies.");
	}
}