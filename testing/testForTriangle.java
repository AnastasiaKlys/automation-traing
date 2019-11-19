package com.company.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.object.Triangle;
import org.junit.jupiter.api.Test;

class testForTriangle {

    private Triangle triangle = new Triangle();
    
    @Test
    public void rightTriangle(){
        assertTrue(triangle.isExist(5.0, 4.0, 3.0));
    }

    @Test
    public void allZeroSides() {
        assertThrows(IllegalArgumentException.class, () -> triangle.isExist(0, 0, 0));
    }

    @Test
    public void oneZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> triangle.isExist(0.0, 4.0, 5.0));
    }

    @Test
    public void oneNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> triangle.isExist(-3.0, 4.0, 5.0));
    }

    @Test
    public void allNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> triangle.isExist(-3.0, -4.0, -5.0));

    }

    @Test
    public void sumOfTwoSidesLessThird() {
        assertFalse(triangle.isExist(3.0, 3.0, 6.1));
    }

    @Test
    public void sumOfTwoSidesEqualsThird()  {
        assertFalse(triangle.isExist(12.5, 12.5, 25.0));
    }

    @Test
    public void sumOfTwoSidesGreaterThird() {
        assertFalse(triangle.isExist(12.6, 99.3, 24.7));
    }

    @Test
    public void allEqualSide(){
        assertTrue(triangle.isExist(5.0, 5.0, 5.0));
    }


}
