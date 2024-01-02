import java.text.DecimalFormat;

public class Circle {
    private double radius, area, circumference;
    private static final double PI = 3.14;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
        area();
        circumference();
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        area = (PI * radius * radius);
        return area;
    }

    public double circumference() {
        circumference = (2 * PI * radius);
        return circumference;
    }

    public String toString() {

        DecimalFormat formatter = new DecimalFormat("#0.00");

        return "A circle has a radius of " + formatter.format(radius) + ". The area is " + formatter.format(area) + " and the circumference is "
                + formatter.format(circumference) + ".";
    }
}
