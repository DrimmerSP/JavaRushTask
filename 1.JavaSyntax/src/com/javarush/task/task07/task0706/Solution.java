package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] housNum = new int[15];
        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
        for (int i = 0; i < housNum.length; i++) {
            housNum[i] = scanner.nextInt();
//            housNum[i] = random.nextInt(300);
//            System.out.println(housNum[i]);
        }
        scanner.close();
        int even = 0; // чётное
        int odd = 0; // нечётное
        for (int i = 0; i < housNum.length; i = i + 2) {
            even = even + housNum[i];
        }
        for (int i = 1; i < housNum.length; i = i + 2) {
            odd = odd + housNum[i];
        }
        if (even != odd){
            String result = even > odd ? "В домах с четными номерами проживает больше жителей." :
                    "В домах с нечетными номерами проживает больше жителей.";

            System.out.println(result);
        }

    }
}
