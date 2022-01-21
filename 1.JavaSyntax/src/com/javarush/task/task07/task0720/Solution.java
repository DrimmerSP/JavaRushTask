package com.javarush.task.task07.task0720;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        scanner.close();
        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
