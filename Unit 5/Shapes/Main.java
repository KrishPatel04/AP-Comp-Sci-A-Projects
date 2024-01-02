import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        System.out.print(
                "- Circle [1]\n- Rectangle [2]\n- Line [3]\n- Trapezoid [4]\n- Triangle [5]\n\nEnter the a number for the corresponding shape/line: ");

        int shape_lineChoice = inputScan.nextInt();

        System.out.println();

        if (shape_lineChoice == 1) {
            System.out.print("What would you like the radius to be? ");

            int radius = inputScan.nextInt();

            Circle cr1 = new Circle(radius);

            System.out.println();
            System.out.println(cr1);

        } else if (shape_lineChoice == 2) {
            System.out.print("What would you like the width to be? ");

            int width = inputScan.nextInt();

            System.out.println();

            System.out.print("What would you like the height to be? ");

            int height = inputScan.nextInt();

            System.out.println();

            Rectangle rect1 = new Rectangle(width, height);

            System.out.println(rect1);
        } else if (shape_lineChoice == 3) {
            System.out.print("What would you like the first xCoordinate to be? ");
            double x1 = inputScan.nextDouble();

            System.out.println();

            System.out.print("What would you like the first yCoordinate to be? ");
            double y1 = inputScan.nextDouble();

            System.out.println();

            System.out.print("What would you like the second xCoordinate to be? ");
            double x2 = inputScan.nextDouble();

            System.out.println();

            System.out.print("What would you like the second yCoordinate to be? ");
            double y2 = inputScan.nextDouble();

            System.out.println();

            Line l1 = new Line(x1, y1, x2, y2);

            System.out.println(l1);

        } else if (shape_lineChoice == 4) {
            System.out.print("What would you like the first base to be? ");
            double base1 = inputScan.nextDouble();

            System.out.println();

            System.out.print("What would you like the second base to be? ");
            double base2 = inputScan.nextDouble();

            System.out.println();

            System.out.print("What would you like the height to be? ");
            double height = inputScan.nextDouble();

            System.out.println();

            Trapezoid trap1 = new Trapezoid(base1, base2, height);

            System.out.println(trap1);
        } else {
            System.out.print("What would you like the base to be? ");
            double base = inputScan.nextDouble();

            System.out.println();

            System.out.print("What would you like the height to be? ");
            double height = inputScan.nextDouble();

            System.out.println();

            Triangle tri1 = new Triangle(base, height);

            System.out.println(tri1);
        }

    }
}
