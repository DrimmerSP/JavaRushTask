package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int chi1;
        int chi2;
        int chi3;
        Scanner scanner = new Scanner(System.in);
        chi1 = scanner.nextInt();
        chi2 = scanner.nextInt();
        chi3 = scanner.nextInt();
        scanner.close();

        int max = Math.max(chi1,Math.max(chi2,chi3));
        int min = Math.min(chi1,Math.min(chi2,chi3));
        int mid = chi1 + chi2 + chi3 - (max + min);
        System.out.println(max + " " + mid + " " + min);
    }
}
