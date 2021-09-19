package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        return line;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        return  num;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double dumbldor = scanner.nextDouble();
        scanner.close();
        return dumbldor;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean boolsh = scanner.nextBoolean();
        scanner.close();
        return boolsh;
    }

    public static void main(String[] args) throws Exception {

    }
}
