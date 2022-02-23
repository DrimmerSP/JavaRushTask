package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 8 2010"));
        map.put("Карандакс", dateFormat.parse("AUGUST 2 2012"));
        map.put("Сюрингов", dateFormat.parse("MAY 1 2012"));
        map.put("Мамаев", dateFormat.parse("JULY 20 2015"));
        map.put("Жоркин", dateFormat.parse("JUNE 11 2008"));
        map.put("Митин", dateFormat.parse("MAY 1 2012"));
        map.put("Чауда", dateFormat.parse("MAY 1 2012"));
        map.put("Папахин", dateFormat.parse("MAY 1 2012"));
        map.put("Нургизов", dateFormat.parse("AUGUST 3 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> tmpMap = new HashMap<>();
        for (Map.Entry<String, Date> item: map.entrySet()) {
            int month = item.getValue().getMonth();
            if (month == 5 || month == 6 || month == 7) {
                tmpMap.put(item.getKey(), item.getValue());
            }
        }
        for (Map.Entry<String, Date> item : tmpMap.entrySet()) {
            map.remove(item.getKey());
        }
    }

    public static void main(String[] args)  {
//        Map<String, Date> kjlhk = createMap();
//        System.out.println(kjlhk);
//        removeAllSummerPeople(kjlhk);
//        System.out.println(" После удаления");
//        System.out.println(kjlhk);
    }
}
