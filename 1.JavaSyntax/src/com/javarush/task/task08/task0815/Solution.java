package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> listOfNames = new HashMap<>();
        listOfNames.put("Иванов", "Иван");
        listOfNames.put("Ивановский", "Гриша");
        listOfNames.put("Заикин", "Саня");
        listOfNames.put("Шустрый", "Пень");
        listOfNames.put("Запрудный", "Иван");
        listOfNames.put("Савельев", "Максим");
        listOfNames.put("Криоген", "Гриша");
        listOfNames.put("Доменов", "Саша");
        listOfNames.put("Изумруд", "Гена");
        listOfNames.put("Довгач", "Витя");
        return listOfNames;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> item : map.entrySet()) {
            if (item.getValue().equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код

        int countLast = 0;
        for (Map.Entry<String, String> item: map.entrySet()) {
            if (item.getKey().equals(lastName)){
                countLast++;
            }
        }
        return countLast;
//        return map.containsKey(lastName)? 1 : 0;    ||Альтернатива||
    }

    public static void main(String[] args) {

    }
}
