package com.javarush.task.task07.task0719;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        //напишите тут ваш код
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
