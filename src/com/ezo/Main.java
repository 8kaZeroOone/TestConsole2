package com.ezo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter counter = new Counter();

        System.out.println("Hello! Please write something.");
        int result = counter.symbols(in.nextLine()); //полученное от пользователя сообщение передаём в класс Counter для работы с ним

        if (result == 0) { //если получаем результат 0
            System.out.println("Empty."); //выводим сообщение о том, что в ведённом пользователем сообщении нет символов "A"
        } else if (result == 1) { //если получаем результат 1
            System.out.println("There is only " + result + " symbol A"); //выводим сообщение о том, что в ведённом пользователем сообщении 1 сивол "A"
        } else { //если получаем любой иной результат
            System.out.println("There are " + result + " symbols A"); //выводим сообщение о том, что в ведённом пользователем сообщении более 1 символа "A"
        }
    }
}
