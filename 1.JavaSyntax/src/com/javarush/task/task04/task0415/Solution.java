package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 0;
        int b = 0;
        int c = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           a = Integer.parseInt(bufferedReader.readLine());
           b = Integer.parseInt(bufferedReader.readLine());
           c = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))){
            System.out.println("Треугольник существует.");
        }else System.out.println("Треугольник не существует.");

    }
}