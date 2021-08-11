package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int chi1;
        int chi2;
        int chi3;
        int chi4;
        Scanner scanner = new Scanner(System.in);
            chi1 = scanner.nextInt();
            chi2 = scanner.nextInt();
            chi3 = scanner.nextInt();
            chi4 = scanner.nextInt();
        scanner.close();

        int max1 = (chi1 > chi2? chi1 : chi2);
        int max2 = (chi3 > chi4? chi3 : chi4);
        System.out.println(max1 > max2? max1 : max2);
    }
}
