package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        scanner.close();
        String s1 = "";
        String s2 = "";
        if (n1 < 1 &&  n1 > 999){
            return;
        }
        if (n1 % 2 == 0) {
            s1 = "четное";
        } else s1 = "нечетное";
        if (n1 >= 1 && n1 <= 9){
            s2 = "однозначное";
            System.out.printf("%s %s число", s1, s2);
            return;
        }else if (n1 >= 10 && n1 <= 99){
            s2 = "двузначное";
            System.out.printf("%s %s число", s1, s2);
            return;
        }else if (n1 >= 100 && n1 <= 999){
            s2 = "трехзначное";
            System.out.printf("%s %s число", s1, s2);
            return;
        }

    }
}
