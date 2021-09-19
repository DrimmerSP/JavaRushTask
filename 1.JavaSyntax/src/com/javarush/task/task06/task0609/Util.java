package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double x = (x2 - x1) * 1.0;
        double y = (y1 - y2) * 1.0;
        double lengh = Math.sqrt((x * x) + (y * y));
        return lengh;
    }

    public static void main(String[] args) {

    }
}
