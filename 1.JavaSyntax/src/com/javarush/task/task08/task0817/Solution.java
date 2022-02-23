package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> mapList = new HashMap<>();
        mapList.put("Иванов", "Иван");
        mapList.put("Ивановский", "Гриша");
        mapList.put("Заикин", "Саня");
        mapList.put("Шустрый", "Пень");
        mapList.put("Запрудный", "Иван");
        mapList.put("Савельев", "Максим");
        mapList.put("Криоген", "Максим");
        mapList.put("Доменов", "Саша");
        mapList.put("Изумруд", "Гена");
        mapList.put("Довгач", "Витя");
        return mapList;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Set<String> uniques = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (Map.Entry<String, String> item: map.entrySet()) {
            if (uniques.contains(item.getValue())){
                duplicates.add(item.getValue());
            }else {
                uniques.add(item.getValue());
            }
        }
        for (String item: duplicates) {
            removeItemFromMapByValue(map, item);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> testM = Solution.createMap();
//        System.out.println(testM);
//        System.out.println("=-=-=-=-==-=-=-=-=-");
//        Solution.removeTheFirstNameDuplicates(testM);
//        System.out.println(testM);
    }
}
