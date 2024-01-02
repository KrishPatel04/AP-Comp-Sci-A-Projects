import java.text.DecimalFormat;

public class Line {
    private double xCoordinate1, yCoordinate1, xCoordinate2, yCoordinate2, distance;

    public Line() {

    }

    public Line(double xCoordinate1, double yCoordinate1, double xCoordinate2, double yCoordinate2) {
        this.xCoordinate1 = xCoordinate1;
        this.yCoordinate1 = yCoordinate1;
        this.xCoordinate2 = xCoordinate2;
        this.yCoordinate2 = yCoordinate2;
    }

    public void setXCoordinate1(double newXCoordinate1) {
        this.xCoordinate1 = newXCoordinate1;
    }

    public void setYCoordinate1(double newYCoordinate1) {
        this.yCoordinate1 = newYCoordinate1;
    }

    public void setXCoordinate2(double newXCoordinate2) {
        this.xCoordinate2 = newXCoordinate2;
    }

    public void setYCoordinate2(double newYCoordinate2) {
        this.yCoordinate2 = newYCoordinate2;
    }

    public double getXCoordinate1() {
        return xCoordinate1;
    }

    public double getYCoordinate1() {
        return yCoordinate1;
    }

    public double getXCoordinate2() {
        return xCoordinate2;
    }

    public double getYCoordinate2() {
        return yCoordinate2;
    }

    public double distance() {
        distance = Math.sqrt((xCoordinate2 - xCoordinate1) + (yCoordinate2 + yCoordinate1));
        return distance;
    }

    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#0.00");

        return "The distance between two points, (" + xCoordinate1 + ", " + yCoordinate1 + ") and (" + xCoordinate2
                + ", " + yCoordinate2 + "), is " + formatter.format(distance) + ".";
    }
}
