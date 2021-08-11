package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg = new Zerg();
            zerg.name = "ZurgOne";
        Zerg zerg1 = new Zerg();
            zerg1.name = "ZurgTwo";
        Zerg zerg2 = new Zerg();
            zerg2.name = "ZurgThri";
        Zerg zerg3 = new Zerg();
            zerg3.name = "ZurgFour";
        Zerg zerg4 = new Zerg();
            zerg4.name = "ZurgFive";

        Protoss protoss = new Protoss();
            protoss.name = "Gurren";
        Protoss protoss1 = new Protoss();
            protoss1.name = "Gurren2";
        Protoss protoss2 = new Protoss();
            protoss2.name = "Gurren3";

        Terran terran = new Terran();
            terran.name = "Вася";
        Terran terran1 = new Terran();
            terran1.name = "Петя";
        Terran terran2 = new Terran();
            terran2.name = "Жора";
        Terran terran3 = new Terran();
            terran3.name = "Саня";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
