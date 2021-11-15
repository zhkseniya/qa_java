package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int expected;

    public FelineParameterizedTest(int expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensFeline() {
        return new Object[][] {
                { 5 },
                { 10 },
        };
    }

    @Test
    public void getKittensReturnTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(expected);
        assertEquals(expected, actual);
    }
}
