package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> listOn3 = new ArrayList<>();
        ArrayList<Integer> listOn2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int tmp = scanner.nextInt();
            mainList.add(tmp);
        }
        scanner.close();

        for (int i = 0; i < mainList.size(); i++) {
            Integer tmps = mainList.get(i);
            if (tmps % 3 == 0) {
                listOn3.add(tmps);
            }
            if (tmps % 2 == 0) {
                listOn2.add(tmps);
            }
            if (tmps % 3 != 0 && tmps % 2 != 0){
                listOther.add(tmps);
            }
        }

//        for (int i = 0; i < mainList.size(); i++) {
//            Integer temps = mainList.get(i);
//             else listOther.add(temps);
//        }

        printList(listOn3);
        System.out.println("======");
        printList(listOn2);
        System.out.println("======");
        printList(listOther);
    }

    public static void printList(ArrayList<Integer> list) {  // не пойму чего ругаается и не принимает.
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}