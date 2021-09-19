package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    //напишите тут ваш код
    public Cat(){
        catCount++;
    }
    protected void finalize() throws Throwable{
        catCount--;
        super.finalize();

    }

    public static void main(String[] args) {
    /*    for (int i = 0; i < 1000000; i++) {
            Cat cat = new Cat();
            cat = null;
        }
        System.out.println(catCount);*/
    }
}