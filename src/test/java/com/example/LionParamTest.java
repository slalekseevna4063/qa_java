package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {
    private final String sex;
    private final boolean expected;

    public LionParamTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline feline;
    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals(expected, lion.doesHaveMane());
}
}
