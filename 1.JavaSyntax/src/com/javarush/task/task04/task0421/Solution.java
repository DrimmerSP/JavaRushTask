package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name1;
        String name2;
        Scanner scanner = new Scanner(System.in);
        name1 = scanner.nextLine();
        name2 = scanner.nextLine();

        scanner.close();

        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        }
        else if (name1.length() == name2.length()){
            System.out.println( "Длины имен равны");
        }
    }
}
