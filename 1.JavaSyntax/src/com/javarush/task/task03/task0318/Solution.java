package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sYears = reader.readLine();
        int years = Integer.parseInt(sYears);
        String name = reader.readLine();
        reader.close();
        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
