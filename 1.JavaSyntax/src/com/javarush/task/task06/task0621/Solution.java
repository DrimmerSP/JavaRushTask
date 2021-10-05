package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //TODO создать семейство
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFather = reader.readLine();
        Cat catGrandF = new Cat(grandFather, null, null);

        String grandMother = reader.readLine();
        Cat catGrandMot = new Cat(grandMother, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandF);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMot, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandF);
        System.out.println(catGrandMot);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(Cat father, String name) {
            this.name = name;
            this.father = father;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }


        @Override
        //TODO исправить вывод в консоль, дописать остальных сородичей
        public String toString() {
            String catsName1 = "The cat's name is " + name;
            String catsNameMother = mother == null ? ", no mother " : ", mother is " + mother.name;
            String catsNameFather = father == null ? ", no father " : ", father is " + father.name;
            return catsName1 + catsNameMother + catsNameFather;
        }
    }

}
