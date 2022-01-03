package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String[] tenLine = new String[10];
        for (int i = 0; i < 8; i++) {
            tenLine[i] = scanner.nextLine();
        }
        for (int i = tenLine.length - 1; i >= 0; i--) {
            System.out.println(tenLine[i]);
        }
    }
}