package com.itproger;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Float> numbers = new LinkedList<>();         //Beveik tas pats kas ArrayList, tik greitesnis
        numbers.add(5.6f);
        numbers.add(15.48484f);
        numbers.add(5.6544848f);
        numbers.add(2f);

        for(Float i: numbers)                                   //Ciklas kolekcijos elementams perrinlti ('DuomenuTipas' 'laikinasKintamasis': 'kolekcijos pavadinimas'
            System.out.println(i);

    }
}
