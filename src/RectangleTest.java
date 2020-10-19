import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class RectangleTest {

    //Initiated rectangle for unit testing, made from the overloaded constructor
    Rectangle rectangleTest = new Rectangle(
            new Point(4, 3),
            new Point(4, 6),
            new Point(6, 6),
            new Point(6, 3));

    @Test
    public void getCenterTest() {
        final Point expected = new Point(5, (int) 4.5);
        final Point actual = rectangleTest.getCenter();
        assertEquals(expected, actual);
    }

    @Test
    public void getAreaTest() {
        final double expected = 6;
        final double actual = rectangleTest.getArea();
        assertEquals(expected, actual);
    }

    @Test
    public void getAreaCircumference() {
        final double expected = 10;
        final double actual = rectangleTest.getCircumference();
        assertEquals(expected, actual);
    }

    @Test
    public void isInsideTrue() {
        final boolean expected = true;
        final boolean actual = rectangleTest.isInside();
        assertEquals(expected, actual);
    }
}
