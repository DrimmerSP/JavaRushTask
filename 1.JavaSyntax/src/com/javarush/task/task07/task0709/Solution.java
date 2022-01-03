package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>(); // обратно добавлено ArrayList<String>
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            strings.add(str);
        }
        scanner.close();

        int largest = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < largest) {  // изменено > на < от предыдущей задачи
                largest = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == largest) {
                System.out.println(strings.get(i));
            }
        }
    }
}
