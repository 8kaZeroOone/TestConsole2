package com.ezo;

class Counter { //в данном классе производится подсчёт количества символов "A" в заданном пользователем сообщении
    int symbols(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) { //с помощью цикла перебираем каждый символ сообщения
            if (line.charAt(i) == 'A') //проверяем является ли символ под номером i - символом "A"
                count++;
        }
        return count;
    }
}
