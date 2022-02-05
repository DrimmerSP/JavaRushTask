package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> setList = new HashSet<Integer>();
        for (int i = 1; i < 21; i++) {
            setList.add(i);
        }
        return  setList;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10() {
        // напишите тут ваш код
        Iterator<Integer> iterator = createSet().iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10)
                iterator.remove();

        }
        return createSet().iterator;
    }

    public static void main(String[] args) {
        System.out.println(createSet() + "  Заполнили сетлист");
        System.out.println("=-=-=-=-=-=-");
        System.out.println(removeAllNumbersGreaterThan10() + "  Тут должны удалить лишнее");
    }
}
