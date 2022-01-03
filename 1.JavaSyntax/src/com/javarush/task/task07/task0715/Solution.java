package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] mmr= {"мама", "мыла", "раму"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < mmr.length; i++) {
            list.add(mmr[i]);
            list.add("именно");  // и такое канает
        }
//        list.add(1,  "именно");
//        list.add(3,  "именно");
//        list.add(5,  "именно");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
