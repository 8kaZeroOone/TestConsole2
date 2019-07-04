package com.ezo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Counter counter = new Counter();

        int actual = counter.symbols("AAA"); //передаём тестовое сообщение с текстом "AAA" в Counter
        int expected = 3; //ожидаемый результат 3
        assertEquals(expected,actual); //сравниваем полученный результат (actual) и ожидаемый (expected)
    }
}