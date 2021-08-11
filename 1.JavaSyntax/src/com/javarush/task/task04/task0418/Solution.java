package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int chi1;
        int chi2;
        Scanner scanner = new Scanner(System.in);
            chi1 = scanner.nextInt();
            chi2 = scanner.nextInt();
        scanner.close();

        if (chi1 < chi2){
            System.out.println(chi1);
        }else System.out.println(chi2);
    }

}