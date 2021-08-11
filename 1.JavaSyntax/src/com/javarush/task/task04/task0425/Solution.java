package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n1;
        int n2;
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        scanner.close();
        if (n1 > 0 && n2 >0){
            System.out.println("1");
        }
        if (n1 < 0 && n2 > 0){
            System.out.println("2");
        }
        if (n1 < 0 && n2 < 0){
            System.out.println("3");
        }
        if (n1 > 0 && n2 < 0){
            System.out.println("4");
        }
    }
}
