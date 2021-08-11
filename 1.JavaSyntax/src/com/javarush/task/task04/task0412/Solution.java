package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        if (a > 0){
            a = a * 2;
            System.out.println(a);
        } else if (a < 0){
            a = a + 1;
            System.out.println(a);
        }else {
            System.out.println(a);
        }
    }

}