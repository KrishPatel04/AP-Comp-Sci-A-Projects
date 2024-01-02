/* Name: Krish Patel
 * Class: AP CS A
 * Teacher: Dr. Savio
 * Period: 5
 * Date: October 7, 2023
 * Purpose: Create a Wall class to be able to return the area of the wall.
 */
public class Main {
    public static void main(String[] args) {
        Wall schoolWall = new Wall(5.0, 5.0);
        System.out.println("Width: " + schoolWall.getWidth());
        System.out.println("Height: " + schoolWall.getHeight());
        System.out.println("Area: " + schoolWall.getArea());
    }
}
