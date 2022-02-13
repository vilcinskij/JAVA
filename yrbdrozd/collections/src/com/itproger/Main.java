package com.itproger;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);         //elemento pridėjimas kaip "push". INDEX ir ELEMENT atsiranda AUTOMATIŠKAI!

//        System.out.println("Kolekcijos ilgis: " + numbers.size());
        System.out.println(numbers.get(1));

        numbers.remove(1);                  //Elemento šalinimas pagal indekso numerį

        for(Integer i : numbers) {
            System.out.println(i);
        }
    }
}
