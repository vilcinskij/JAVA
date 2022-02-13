package com.itproger;

public class Main {

    public static void main(String[] args) {
//
//        info( "Hello");                                                     //'word' ATSIRANDA AUTOMATIŠKAI!!!
//        String java = "Java";
//        info(java);
//        info("");

        int num1 = 7;
        int rezult1 = summa(5, num1);
        info(String.valueOf(rezult1));

        int num2 = 7;
        int rezult2 = summa(5, num2);                                                      // "a:" ir "b:" ATSIRANDA AUTOMATIŠKAI!!!

    }

    public static int summa(int a, int b) {                                  //short, arba int, arba byte....
        int rez = a + b;
        String rezult = "Rezultatas: " + rez;
        info(rezult);
        return rez;
    }

    public static void info(String word) {                                        //info - betkoks pavadinimias, word - betkoks pavadinimias
        System.out.print(word);
        System.out.println("!");
    }
}
