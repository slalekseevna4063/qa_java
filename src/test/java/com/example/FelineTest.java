package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int kittensCount;

    public FelineTest (int kittensCount) {
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
    public void eatMeat() throws Exception {
    Feline feline = new Feline();
    assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
    Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
    Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittens2() {
    Feline feline = new Feline();
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}