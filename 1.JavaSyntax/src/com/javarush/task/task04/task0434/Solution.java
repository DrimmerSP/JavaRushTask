package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int num1 = 1;
        int num2 = 1;
        while (num1 <= 10){
            while (num2 <= 10){
                System.out.print(num1 * num2 + " ");
                num2++;
            }
            System.out.println();
            num2 = 1;
            num1++;
        }

    }
}
