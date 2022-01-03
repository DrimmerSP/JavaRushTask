package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мера");
        strings.add("вода");
        strings.add("упор");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        String strR = "р";
        String strL = "л";
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String item = strings.get(i);
            if (!item.contains(strR) && !item.contains(strL)){
                result.add(item);
                continue;
            }
            if (item.contains(strR) && !item.contains(strL)){
                continue;
            }
            if (item.contains(strL) && !item.contains(strR)){
                result.add(item);
                result.add(item);
            }
            if (item.contains(strR) && item.contains(strL)){
                result.add(item);
            }
        }
        return result;
    }
}