package com.example.springboot.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilTest {

    // https://www.mathsisfun.com/numbers/fibonacci-sequence.html
    // http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html

    @Test
    void fibonacci_0() {
        assertEquals(0, MathUtil.fibonacci(0));
    }

    @Test
    void fibonacci_1() {
        assertEquals(1, MathUtil.fibonacci(1));
    }

    @Test
    void fibonacci_2() {
        assertEquals(1, MathUtil.fibonacci(2));
    }

    @Test
    void fibonacci_3() {
        assertEquals(2, MathUtil.fibonacci(3));
    }

}
