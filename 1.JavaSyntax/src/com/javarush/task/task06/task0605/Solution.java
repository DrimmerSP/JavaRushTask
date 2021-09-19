package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double indexBody = weight / (height * height);
            if (indexBody < 18.5){
                System.out.println("Недовес: меньше чем 18.5");
            }
            if ((indexBody >= 18.5) && (indexBody < 25)){
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if ((indexBody >= 25) && (indexBody < 30)){
                System.out.println("Избыточный вес: между 25 и 30");
            }
            if (indexBody >= 30){
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
