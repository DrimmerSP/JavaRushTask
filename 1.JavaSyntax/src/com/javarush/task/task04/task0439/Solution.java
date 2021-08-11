package com.javarush.task.task04.task0439;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Письмо счастья
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(text + " любит меня.");
        }
    }
}
