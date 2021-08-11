package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(75, 2.16));
        System.out.println(convertEurToUsd(1300, 2.16));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //напишите тут ваш код
        double usd = eur * exchangeRate;
    return usd;
    }
}
