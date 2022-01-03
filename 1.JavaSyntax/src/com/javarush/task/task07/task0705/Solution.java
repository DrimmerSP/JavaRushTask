package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numbers = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] numCopy1 = new int[10];
        numCopy1 = Arrays.copyOf(numbers, 9);
        int[] numCopy2 = new int[10];
        numCopy2 = Arrays.copyOfRange(numbers, 10, 20);
        for (int i = 0; i < numCopy2.length; i++) {
            System.out.println(numCopy2[i]);
        }
    }
}
