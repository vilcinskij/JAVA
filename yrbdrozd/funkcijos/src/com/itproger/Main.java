package com.itproger;

public class Main {

    public static void main(String[] args) {

        info( "Hello");                                                     //'word' ATSIRANDA AUTOMATIŠKAI!!!
        String java = "Java";
        info(java);
        info("");

        int num = 7;
        summa(5, num);                                                      // "a:" ir "b:" ATSIRANDA AUTOMATIŠKAI!!!

    }

    public static void summa(int a, int b) {                                  //short, arba int, arba byte....
        int rez = a + b;
        System.out.println("Rezultatas: " + rez);
    }

    public static void info(String word) {                                        //info - betkoks pavadinimias, word - betkoks pavadinimias
        System.out.print(word);
        System.out.println("!");
    }
}
