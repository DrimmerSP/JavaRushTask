package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour){
     return (hour * 60 * 60);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(18));
        System.out.println(convertToSeconds(48));

    }
}
