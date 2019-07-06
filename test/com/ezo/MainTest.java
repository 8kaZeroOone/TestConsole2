package com.ezo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Counter counter = new Counter();

        int actual = counter.symbols("AAA"); //передаём тестовое сообщение в Counter
        int expected = 3; //ожидаемый результат 3
        assertEquals(expected,actual); //сравниваем полученные результаты

        int actual1 = counter.symbols("aaa"); //передаём тестовое сообщение в Counter
        int expected1 = 0; //ожидаемый результат 3
        assertEquals(expected1,actual1); //сравниваем полученные результаты

        int actual2 = counter.symbols("Hello, World!"); //передаём тестовое сообщение в Counter
        int expected2 = 0; //ожидаемый результат 3
        assertEquals(expected2,actual2); //сравниваем полученные результаты

        int actual3 = counter.symbols("How are you, Alexender?"); //передаём тестовое сообщение в Counter
        int expected3 = 1; //ожидаемый результат 3
        assertEquals(expected3,actual3); //сравниваем полученные результаты
    }
}