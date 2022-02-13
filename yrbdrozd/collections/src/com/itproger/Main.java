package com.itproger;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);

        for(Integer i : numbers) {
            System.out.println(i);
        }
    }
}
