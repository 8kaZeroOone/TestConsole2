package com.ezo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Counter counter = new Counter();

        int actual = counter.symbols("AAA");
        int exeptual = 3;
        assertEquals(exeptual,actual);
    }
}