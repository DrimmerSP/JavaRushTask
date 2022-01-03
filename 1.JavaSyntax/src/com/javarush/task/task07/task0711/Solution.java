package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            list.add(str);
        }
        String trigger = "";
        for (int i = 0; i < 13; i++) {
            trigger = list.get(4);
            list.add(0, trigger);
            list.remove(5);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
