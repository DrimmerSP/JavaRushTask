package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.close();
        int ptru = 0;
        int ntru = 0;

        if (n1 > 0){
            ptru++;
        }
        if (n1 < 0){
            ntru++;
        }
        if (n2 > 0){
            ptru++;
        }
        if (n2 < 0){
            ntru++;
        }
        if (n3 > 0){
            ptru++;
        }
        if(n3 < 0){
            ntru++;
        }
        System.out.println("количество отрицательных чисел: " + ntru);
        System.out.println("количество положительных чисел: " + ptru);
    }
}
