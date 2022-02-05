package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> listInt = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            listInt.add(scanner.nextInt());
        }

        int currentLeng = 1;
        int maxLenght = 1;
       // int current;
        for (int i = 0; i < listInt.size() - 1; i++) {  // Была ошибка выхода за границы массива. listInt.size() - 1 решила проблему.
      //      int tmp = listInt.get(i); //Дебри
            if (listInt.get(i).equals(listInt.get(i+1))) {
                currentLeng++;
                if (currentLeng >= maxLenght){
                    maxLenght = currentLeng;
                }
            }else currentLeng = 1;

        }
        System.out.println(maxLenght);
    }
}
