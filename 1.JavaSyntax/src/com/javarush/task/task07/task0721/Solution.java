package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        //напишите тут ваш код
        int[] mainArray = getInts();
        int maximum = mainArray[0];
        int minimum = mainArray[0];
        for (int i = 0; i < mainArray.length; i++) {
            if (maximum < mainArray[i]){
                maximum = mainArray[i];
            }
            if (minimum > mainArray[i]){
                minimum = mainArray[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() {
        Scanner scanner = new Scanner(System.in);
        int[] tmpArray = new int[20];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = scanner.nextInt();
        }
        scanner.close();
        return tmpArray;
    }
}
