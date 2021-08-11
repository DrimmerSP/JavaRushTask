package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
    }

    public static class Person {
        String name = "Вася";
        int age = 26;
        int weight = 68;
        int money = 526000;
    }
}
