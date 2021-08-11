package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате
*/

public class Solution {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int salary) {
        // напишите тут ваш код
        salary = salary + 100;
        System.out.println("Твоя зарплата составляет: " + salary + " долларов в месяц.");
    }
}
