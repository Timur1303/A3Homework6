package kg.app.a3homework6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import kg.app.a3homework6.domain.Math;

import static org.junit.Assert.assertEquals;

public class MathTest {

    private Math math;

    @Before
    public void setup(){
        math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void addTest(){
        assertEquals(5, math.add(2, 3));
        assertEquals(5, math.add(15, -10));
        System.out.println("ADD");
    }

    @Test
    public void divTest(){
        assertEquals(5, math.div(30, 6));
        System.out.println("DIV");

    }

    @Test
    public void subTest(){
        assertEquals(6, math.sub(18, 12));
        assertEquals(10, math.sub(15, 5));
        System.out.println("SUB");
    }

    @Test
    public void mulTest(){
        assertEquals(10, math.mul(2, 5));
        assertEquals(25, math.mul(5, 5));
        System.out.println("MUL");
    }



    @After
    public void clear() {
        math = null;
        System.out.println("AFTER");
    }
}
