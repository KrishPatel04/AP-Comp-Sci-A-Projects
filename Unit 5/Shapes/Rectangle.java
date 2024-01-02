public class Rectangle {
    private double width;
    private double height;
    private boolean square;

    public Rectangle() {
        width = 1;
        height = 1;
        isSquare();
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        isSquare();
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
        isSquare();
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
        isSquare();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean getSquare() {
        return square;
    }

    public boolean isSquare() {
        square = (width == height);
        return square;
    }

    public String toString() {
        return "A rectangle has a width of " + width + " and a height of " + height
                + ". The isSquare status for this rectangle is " + square + ".";
    }
}
