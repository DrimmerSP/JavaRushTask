package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(bufferedReader.readLine()) % 5;
        bufferedReader.close();

        if (t < 3){
            System.out.println("зелёный");
            return;
        }
        if (t < 4){
            System.out.println("жёлтый");
        }else {
            System.out.println("красный");
        }
    }
}