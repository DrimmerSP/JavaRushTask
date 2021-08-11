package com.javarush.task.task02.task0216;

/* 
Минимум трёх чисел
*/

public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int m = min(a, b);
        m = min(m, c);

        return m;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код (Предыдущая задача)
        int m;
        if (a < b)
            m = a;
        else
            m = b;
        return m;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
