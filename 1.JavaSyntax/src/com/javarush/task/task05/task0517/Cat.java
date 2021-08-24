package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 4;
        this.weight = 12;
        this.color = "Orange";
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Red";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 7;
        this.color = "Purple";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }

    public static void main(String[] args) {

    }
}
