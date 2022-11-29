package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineParamTest {
    private final int kittensCount;

    public FelineParamTest (int kittensCount) {
        this.kittensCount = kittensCount;
    }
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {5},
                {10},
                {22},
        };
    }

    @Test
    public void getKittens2() {
        Feline feline = new Feline();
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}


