package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str;
        for (int i = 0; true; i = i) {
            str = scanner.nextLine();
            if (str.equals("end")){
                break;
            }
            list.add(str);
        }
        scanner.close();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}