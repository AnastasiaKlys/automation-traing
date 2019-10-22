package com.company.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.object.Triangle;
import org.junit.jupiter.api.Test;

class testForTriangle {

    private Triangle triangle = new Triangle();

    @Test
    void exist() {
        assertEquals(true, triangle.isExist(3, 4, 5));
        assertEquals(true, triangle.isExist(7, 9, 10));
        assertEquals(true, triangle.isExist(1, 1, 1));
        assertEquals(true, triangle.isExist(4, 4, 5));
        assertEquals(true, triangle.isExist(9, 8, 7));
        assertEquals(true, triangle.isExist(4, 5, 3));
        assertEquals(false, triangle.isExist(3, 9, 5));
        assertEquals(false, triangle.isExist(-3, -9, -5));
        assertEquals(false, triangle.isExist(0, 9, 5));
        assertEquals(false, triangle.isExist(0, -8, 100));
    }

}
