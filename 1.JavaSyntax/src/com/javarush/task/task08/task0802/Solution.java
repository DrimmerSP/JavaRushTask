package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> mapList = new HashMap<String, String>();
        mapList.put("арбуз", "ягода");
        mapList.put("банан", "трава");
        mapList.put("вишня", "ягода");
        mapList.put("груша", "фрукт");
        mapList.put("дыня", "овощ");
        mapList.put("ежевика", "куст");
        mapList.put("жень-шень", "корень");
        mapList.put("земляника", "ягода");
        mapList.put("ирис", "цветок");
        mapList.put("картофель", "клубень");

        for (Map.Entry<String, String> item : mapList.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
