package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n1;
        int n2;
        int n3;
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        scanner.close();

        if (n1 == n2){
            System.out.println("3");
        }
        if (n1 == n3){
            System.out.println("2");
        }
        if (n2 == n3){
            System.out.println("1");
        }
    }
}
