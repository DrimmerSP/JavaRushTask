package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.close();
        int ntru = 0;

            if (n1 > 0){
                ntru++;
            }
            if (n2 > 0){
                ntru++;
            }
            if (n3 > 0){
                ntru++;
            }
        System.out.println(ntru);
    }
}
