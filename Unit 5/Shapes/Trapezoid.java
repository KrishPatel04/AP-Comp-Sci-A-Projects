public class Trapezoid {
    private double base1, base2, height, area;

    public Trapezoid() { 

    }

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;

        area();
    }

    public void setBase1(double newBase1) {
        this.base1 = newBase1;
    }

    public void setBase2(double newBase2) {
        this.base2 = newBase2;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        area = (.5*(base1 + base2)*height);
        return area;
    }

    public String toString() {
        return "A trapezoid with base 1 of " + base1 + " and a base 2 of " + base2 + ". The height is " + height + ". The area of this trapezoid is " + area + ".";
    }
}
