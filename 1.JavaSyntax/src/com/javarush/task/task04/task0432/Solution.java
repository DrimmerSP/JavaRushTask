package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String strline = scanner.nextLine();
        int numwalue = scanner.nextInt();
        scanner.close();

        while (numwalue > 0){
            System.out.println(strline);
            numwalue--;
        }
    }
}
