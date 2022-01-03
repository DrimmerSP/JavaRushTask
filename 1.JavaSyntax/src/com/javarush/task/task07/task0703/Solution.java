package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] tenLines = new String[10];
        int[] tenInt = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tenLines.length; i++) {
            tenLines[i] = scanner.nextLine();
            tenInt[i] = tenLines[i].length();
        }
        scanner.close();
        for (int i = 0; i < tenInt.length; i++) {
            System.out.println(tenInt[i]);
        }
    }
}
