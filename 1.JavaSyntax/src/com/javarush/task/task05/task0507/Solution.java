package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            count++;
            sum = sum + num;

        }
        scanner.close();
        System.out.println((double) sum / count);
    }
}

