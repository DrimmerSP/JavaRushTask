package com.javarush.task.task07.task0708;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>(); // убрали "ArrayList<String>" перед strings
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            strings.add(str);
        }
        scanner.close();
        int largest = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > largest) {
                largest = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == largest) {
                System.out.println(strings.get(i));
            }
        }
//        for (String item: strings) {
//            if (item.length() == largest){
//                System.out.println(item);
//            }
//        }
    }
}
