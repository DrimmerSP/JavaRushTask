package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> mapList = new HashMap<>();
        mapList.put("Иванов", 345);
        mapList.put("Ивановский", 501);
        mapList.put("Заикин", 1024);
        mapList.put("Шустрый", 512);
        mapList.put("Запрудный", 256);
        mapList.put("Савельев", 2048);
        mapList.put("Криоген", 1020);
        mapList.put("Доменов", 720);
        mapList.put("Изумруд", 100);
        mapList.put("Довгач", 50);
        return mapList;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String, Integer> item: map.entrySet()) {
            if (item.getValue() < 500){
                keys.add(item.getKey());
            }
        }
        for (String item: keys) {
            map.remove(item);
        }
    }

    public static void main(String[] args) {
//        Map<String, Integer> test = Solution.createMap();
//        System.out.println(test);
//        System.out.println("==-==-=-===-=-");
//        removeItemFromMap(test);
//        System.out.println(test);
    }
}