package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> setList = new HashSet<String>();
        setList.add("арбуз");
        setList.add("банан");
        setList.add("вишня");
        setList.add("груша");
        setList.add("дыня");
        setList.add("ежевика");
        setList.add("женьшень");
        setList.add("земляника");
        setList.add("ирис");
        setList.add("картофель");

        for (String item : setList) {
            System.out.println(item);
        }
    }
}
