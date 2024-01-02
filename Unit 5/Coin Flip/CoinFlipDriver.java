import java.util.Scanner;

public class CoinFlipDriver {
    public static void main(String[] args) throws Exception {
        Scanner inputScan = new Scanner(System.in);

        System.out.print("What is the bias? ");
        double bias = inputScan.nextDouble();

        inputScan.close();

        CoinFlip coin = new CoinFlip(bias);

        int numHeads = 0;
        int numTails = 0;

        for (int i = 1; i <= 100; i++) {
            coin.flip();
            System.out.print(coin + " ");
            if (coin.getFace() == 0) { // if face = heads
                numHeads++;
            } else { // if face = tails
                numTails++;
            }

            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90
                    || i == 100) { // Whenever it hits an increment of 10, use println to go to next line. This is
                                   // so that 10 coin flips are printed per line.
                System.out.println();
            }
        }

        System.out.println("\nNumber of Heads: " + numHeads);
        System.out.println("Number of Tails: " + numTails);
        System.out.println("Longest run of Heads: " + coin.getMaxConsecutiveHeads());
        System.out.println("Longest run of Tails: " + coin.getMaxConsecutiveTails());
    }
}
