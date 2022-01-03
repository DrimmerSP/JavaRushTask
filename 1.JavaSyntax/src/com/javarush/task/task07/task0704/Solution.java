package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] tenNum = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tenNum.length; i++) {
            tenNum[i] = scanner.nextInt();
        }
        for (int j = tenNum.length - 1; j >= 0 ; j--) {
            System.out.println(tenNum[j]);
        }
    }
}

