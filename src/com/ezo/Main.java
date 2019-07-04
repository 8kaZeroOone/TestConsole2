package com.ezo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter counter = new Counter();

        System.out.println("Hello! Please write something");
        int result = counter.symbols(in.nextLine());

        if (result == 0) {
            System.out.println("Empty.");
        } else if (result == 1) {
            System.out.println("There is only " + result + " symbol A");
        } else {
            System.out.println("There are " + result + " symbols A");
        }
    }
}
