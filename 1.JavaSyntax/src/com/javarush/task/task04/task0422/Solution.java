package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int age;
        Scanner scanner= new Scanner(System.in);
        name = scanner.nextLine();
        age = scanner.nextInt();
        scanner.close();

        if (age < 18){
            System.out.println("Подрасти еще");
        }
    }
}
