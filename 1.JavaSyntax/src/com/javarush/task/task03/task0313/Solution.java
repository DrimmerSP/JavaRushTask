package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";

        print(a, b, c);
        print(a, c, b);
        print(b, c, a);
        print(c, b, a);
        print(b, a, c);
        print(c, a, b);
    }

    private static void print(String a1, String b1, String c1) {
        System.out.println(a1 + b1 + c1);
    }
}
