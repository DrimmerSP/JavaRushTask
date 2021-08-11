package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int pointCat1 = 0, pointCat2 = 0;
        if (this.age > anotherCat.age){
            pointCat1++;
        }else if (this.age == anotherCat.age){
            pointCat1++;
            pointCat2++;
        }
        else pointCat2++;

        if (this.weight > anotherCat.weight){
            pointCat1++;
        }else if (this.weight == anotherCat.weight){
            pointCat1++;
            pointCat2++;
        }
        else pointCat2++;

        if (this.strength > anotherCat.strength){
            pointCat1++;
        }else if (this.strength == anotherCat.strength){
            pointCat1++;
            pointCat2++;
        }
        else pointCat2++;

        return pointCat1 > pointCat2;
    }

    public static void main(String[] args) {

    }
}
