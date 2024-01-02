public class Triangle {
    private double base, height, area;

    public Triangle() {

    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        area();
    }

    public void setBase(double newBase) {
        this.base = newBase;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        area = (.5*base*height);
        return area;
    }

    public String toString() {
        return "An triangle has a base of " + base + " and a height of " + height + ". This triangle has an area of " + area + ".";
    }
}
