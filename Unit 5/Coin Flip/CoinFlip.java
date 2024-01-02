public class CoinFlip {
    private int myFace;
    private double myBias;
    private static int HEADS = 0;
    private static int TAILS = 1;

    // Variables for num of heads, tails, and consecutive heads/tails
    private int consecutiveHeads;
    private int consecutiveTails;
    private int maxConsecutiveHeads;
    private int maxConsecutiveTails;

    public CoinFlip() {
        myFace = HEADS;
        myBias = 0.5; // unbiased
        consecutiveHeads = 0;
        consecutiveTails = 0;
        maxConsecutiveHeads = 0;
        maxConsecutiveTails = 0;
    }

    public CoinFlip(double myBias) {
        this.myBias = myBias;
        consecutiveHeads = 0;
        consecutiveTails = 0;
        maxConsecutiveHeads = 0;
        maxConsecutiveTails = 0;
    }

    public void flip() {
        if (Math.random() < myBias) {
            myFace = HEADS;
            consecutiveHeads++;
            consecutiveTails = 0;
        } else {
            myFace = TAILS;
            consecutiveTails++;
            consecutiveHeads = 0;
        }

        if (consecutiveHeads > maxConsecutiveHeads) {
            maxConsecutiveHeads = consecutiveHeads;
        }

        if (consecutiveTails > maxConsecutiveTails) {
            maxConsecutiveTails = consecutiveTails;
        }
    }

    public int getFace() {
        return myFace;
    }

    public int getMaxConsecutiveHeads() {
        return maxConsecutiveHeads;
    }

    public int getMaxConsecutiveTails() {
        return maxConsecutiveTails;
    }

    public String toString() {
        return (myFace == HEADS) ? "Heads" : "Tails";
    }
}
