package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int chi1;
        int chi2;
        int chi3;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        chi1 = Integer.parseInt(bufferedReader.readLine());
        chi2 = Integer.parseInt(bufferedReader.readLine());
        chi3 = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        if ((chi1 == chi2) && (chi1 == chi3)){
            System.out.print(chi1 + " " + chi2 + " " + chi3);
            return;
        }
        if (chi1 == chi2){
            System.out.print(chi1 + " " + chi2);
        }
        if (chi1 == chi3){
            System.out.print(chi1 + " " + chi3);
        }
        if (chi2 == chi3) {
            System.out.print(chi2 + " " + chi3);
        }
    }
}