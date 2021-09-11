package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date();
        SimpleDateFormat formatDateNow = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formatDateNow.format(date));
    }
}
