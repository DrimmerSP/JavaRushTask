package com.javarush.task.task04.task0426;

import java.util.Scanner;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        scanner.close();

        String s1 = "";
        String s2 = "";
        if (n1 == 0) {
            System.out.println("ноль");
            return;
        }
        if (n1 > 0) {
            s1 = "положительное";
        } else s1 = "отрицательное";
        if (n1 % 2 == 0) {
            s2 = "четное";
        } else s2 = "нечетное";
        System.out.println(String.format("%s %s число", s1, s2));

    }
}
