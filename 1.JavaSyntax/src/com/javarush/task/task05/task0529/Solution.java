package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        String line1 = "";
        while (true){
            line1 = scanner.nextLine();
            if (line1.equals("сумма")){
                break;
            }
            num1 += Integer.parseInt(line1);
        }
        System.out.println(num1);
        scanner.close();
    }
}
