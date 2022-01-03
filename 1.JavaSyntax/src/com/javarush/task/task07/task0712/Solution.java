package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String str = scanner.nextLine();
            list.add(str);
        }
        scanner.close();

        int largest = list.get(0).length();
        int largestPos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > largest) {
                largest = list.get(i).length();
                largestPos = i;
            }
        }
        int shorten = list.get(0).length();
        int shortenPos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < shorten) {
                shorten = list.get(i).length();
                shortenPos = i;
            }
        }
        String result = largestPos < shortenPos ? list.get(largestPos) : list.get(shortenPos);
        System.out.println(result);

    }
}
