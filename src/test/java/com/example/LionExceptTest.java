package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LionExceptTest {

        @Test
        public void lionSexExcept () throws Exception {

            try {
                Lion lion = new Lion(null, "Сам11ец");
                assertFalse("Исключение не поймано, ошибка отсутствует: пользователь использовал валидное значение (Самец или Самка)", true);
            }
            catch (Exception e){
                assertEquals("Поймали исключение, текст ошибки не соответствует ожидаемому","Используйте допустимые значения пола животного - самей или самка", e.getMessage());
            }
        }
    }

