package demo.parallel.test;

import demo.parallel.Complex;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(2, 3);
        a.minus(b);

        assertEquals("Real part should be 3", 3.0, a.getRe(), 0.0001);
        assertEquals("Imaginary part should be 4", 4.0, a.getIm(), 0.0001);

        Complex c = new Complex(-3, -5);
        Complex d = new Complex(1, 2);
        c.minus(d);

        assertEquals("Real part should be -4", -4.0, c.getRe(), 0.0001);
        assertEquals("Imaginary part should be -7", -7.0, c.getIm(), 0.0001);
    }

    @Test
    public void testDiv() {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(1, 2);
        a.div(b);

        assertEquals("Real part should be 2.8", 2.8, a.getRe(), 0.0001);
        assertEquals("Imaginary part should be -0.6", -0.6, a.getIm(), 0.0001);

        Complex c = new Complex(10, 15);
        Complex d = new Complex(5, 0);
        c.div(d);

        assertEquals("Real part should be 2", 2.0, c.getRe(), 0.0001);
        assertEquals("Imaginary part should be 3", 3.0, c.getIm(), 0.0001);
    }
}