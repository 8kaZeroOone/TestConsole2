package com.ezo;

public class Counter {
    public int symbols(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'A')
                count++;
        }
        return count;
    }
}
