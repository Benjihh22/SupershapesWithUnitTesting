import java.awt.*;
import java.util.Scanner;

public class Circle extends Shape {

    int xCoord;
    int yCoord;
    int r;
    Point centerPoint;

    public Circle(Scanner scanner, Point centerPoint, int radius) {
        this.centerPoint = centerPoint;
        this.r = radius;
        xCoord = getInt(scanner, "Enter an x-value for the circle: ");
        yCoord = getInt(scanner, "Enter a y-value for the circle: ");
    }

    public Circle(Point centerPoint, int radius) {
        this.centerPoint = centerPoint;
        this.r = radius;
        xCoord = 4;
        yCoord = 4;
    }

    public Point getCenter() {
        Point centerPointC = new Point(centerPoint.x, centerPoint.y);
        return centerPointC;
    }

    public String printGetCenter() {
        System.out.print("The center of the circle is: ");
        return printGetCenter();
    }

    public double getArea() {
        return (Math.PI * (r * r));
    }

    public String printGetArea() {
        System.out.print("The area of this circle is: ");
        return printGetArea();
    }

    public double getCircumference() {
        return ((2 * Math.PI) * r);
    }

    public String printGetCircumference() {
        System.out.print("The circumference of this circle is: ");
        return printGetCircumference();
    }

    public boolean isInside() {
        if (Math.sqrt((xCoord - centerPoint.x) * (xCoord - centerPoint.x) +
                (yCoord - centerPoint.y) * (yCoord - centerPoint.y)) <= r) {
            return true;
        } else {
            return false;
        }
    }

    // Print method moved out of isInside for the true statement
    public String isInsideTrue() {
        System.out.println("Your point is inside a circle");
        System.out.println(getArea());
        System.out.println(getCircumference());
        System.out.println(getCenter() + "\n");
        return isInsideTrue();
    }

    // Print method moved out of isInside for the false statement
    public String isInsideFalse() {
        System.out.println("Your point is not inside a circle");
        return isInsideFalse();
    }
}

