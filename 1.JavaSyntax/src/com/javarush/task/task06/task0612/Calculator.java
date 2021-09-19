package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int numP = a + b;
        return numP;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int numM = a - b;
        return numM;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int numMulti = a * b;
        return numMulti;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double numD = (a * 1.0) / (b * 1.0);
        return numD;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double numPercent = ((a / 100.0) * b);
        return numPercent;
    }

    public static void main(String[] args) {
     /*   System.out.println(plus(5, 15));
        System.out.println(minus(50, 5));
        System.out.println(multiply(5, 5));
        System.out.println(division(100, 23));
        System.out.println(percent(205, 3));*/
    }
}