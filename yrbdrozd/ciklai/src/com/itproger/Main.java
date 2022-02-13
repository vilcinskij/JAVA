package com.itproger;

public class Main {

    public static void main(String[] args) {
//	    for(float i = 100; i > 0; i /= 2) {
//            System.out.println("Elenet: " + i);
//      }

//      int i = 0;
//      while (i < 10) {
//          i++;
//          System.out.println("Element: " + i);
//      }

        int i = 100;
        do {
            i *= 10;
            System.out.println("Element: " + i);
        } while(i < 10);
    }
}
