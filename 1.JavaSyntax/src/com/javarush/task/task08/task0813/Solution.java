package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> setList = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            setList.add("Л" +  Math.random());
        }
        return setList;
    }

    public static void main(String[] args) {
    }
}
