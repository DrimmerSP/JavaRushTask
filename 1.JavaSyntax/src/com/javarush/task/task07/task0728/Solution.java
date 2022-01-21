package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int item : array) {
            System.out.println(item);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        int[] unoSort = new int[array.length];
        for (int i = 0; i < unoSort.length; i++) {
            unoSort[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < unoSort.length; i++) {
            array[i] = unoSort[i];
        }
    }
}
