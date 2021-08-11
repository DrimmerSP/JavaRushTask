package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.close();

        int max = Math.max(Math.max(n1, n2), n3);
        int min = Math.min(Math.min(n1, n2), n3);
        int med = (n1 + n2  + n3) - (max + min);
        System.out.println(med);
    }
}
