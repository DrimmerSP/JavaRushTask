package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human human1 = new Human("Деда", true, 80 );
        Human human2 = new Human("Баба", false, 75);
        Human human3 = new Human("Дедушка", true, 81);
        Human human4 = new Human("Бабашка", false, 76);
        Human human5 = new Human("Батя", true, 65, human1, human2);
        Human human6 = new Human("Мама", false, 58, human3, human4);
        Human human7 = new Human("Павел", true, 33, human5, human6);
        Human human8 = new Human("Денис", true, 30, human5, human6);
        Human human9 = new Human("Катя", false, 25, human5, human6);

//        ArrayList<Human> humanList = new ArrayList<>();
//        humanList.add(human1);
//        humanList.add(human2);
//        humanList.add(human3);
//        humanList.add(human4);
//        humanList.add(human5);
//        humanList.add(human6);
//        humanList.add(human7);
//        humanList.add(human8);
//        humanList.add(human9);
//        for (Human item : humanList) {
//            System.out.println(item);
//        }
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

    }
}