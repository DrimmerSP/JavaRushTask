package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (number != 0){
            if (number %2 == 0){
                even++;
            }else odd++;
            number = number / 10;
        }
        scanner.close();
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
