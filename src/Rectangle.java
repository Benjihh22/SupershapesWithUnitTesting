import java.awt.*;
import java.util.Scanner;

public class Rectangle extends Shape {

    int xCoord;
    int yCoord;
    Point pA;
    Point pB;
    Point pC;
    Point pD;

    public Rectangle(Scanner scanner, String name, Point pA, Point pB, Point pC, Point pD) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        this.pD = pD;
        xCoord = getInt(scanner, "Enter an x-value for the rectangle: ");
        yCoord = getInt(scanner, "Enter a y-value for the rectangle: ");
    }

    //Rectangle constructor overload for test class "RectangleTest" only
    public Rectangle(Point pA, Point pB, Point pC, Point pD) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        this.pD = pD;
        xCoord = 5;
        yCoord = 4;
    }

    public Point getCenter() {
        int x = (pD.x - pA.x) / 2 + pA.x;
        int y = (pB.y - pA.y) / 2 + pA.y;
        Point centerPointR = new Point(x, y);
        return centerPointR;
    }

    // Print method (Moved out from getCenter)
    public String printGetCenter() {
        System.out.println("The center of the rectangle is: ");
        return printGetCenter();
    }

    public double getArea() {
        return (pC.x - pA.x) * (pC.y - pA.y);
    }

    // Print method (Moved out from getArea)
    public String printGetArea() {
        System.out.println("The area of this rectangle is: ");
        return printGetArea();
    }

    public double getCircumference() {
        return ((pC.x - pA.x) * 2) + ((pC.y - pA.y) * 2);
    }

    public String printGetCircumference() {
        System.out.print("The circumference of this rectangle is: ");
        return printGetCircumference();
    }

    public boolean isInside() {
        if (xCoord >= pA.x && yCoord >= pA.y && xCoord <= pC.x && yCoord <= pC.y) {
            return true;
        } else {
            return false;
        }
    }

    // Print method moved out of isInside for the true statement
    public String printIsInsideTrue() {
        System.out.println("Your point is inside a rectangle");
        System.out.println(getArea());
        System.out.println(getCircumference());
        System.out.println(getCenter() + "\n");
        return printIsInsideTrue();
    }

    // Print method moved out of isInside for the false statement
    public String printIsInsideFalse() {
        System.out.println("Your point is not inside a rectangle");
        return printIsInsideFalse();
    }
}