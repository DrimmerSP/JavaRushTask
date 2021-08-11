package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            sum = sum + num;
            if (num == -1) {
                break;
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}