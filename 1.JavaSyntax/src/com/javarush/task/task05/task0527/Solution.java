package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Dog simbaDog = new Dog("Simba", 21, 146);
        Cat tomCat = new Cat("Tom", 666, 98);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public  static class Dog{
        String name;
        int weight;
        int strangh;
        public Dog(String name, int weight, int strangh){
            this.name = name;
            this.weight = weight;
            this.strangh = strangh;
        }
    }
    public static class Cat{
        String name;
        int vitality;
        int speed;
        public Cat(String name, int vitality, int speed){
            this.name = name;
            this.vitality = vitality;
            this.speed = speed;

        }
    }
}
