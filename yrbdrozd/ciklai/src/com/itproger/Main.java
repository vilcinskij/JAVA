package com.itproger;

public class Main {

    public static void main(String[] args) {
	    for(float i = 5; i < 25; i += 2) {
            if (i % 3 == 0)
                continue;

            if (i >= 17)
                break;
            System.out.println("Elenet: " + i);
      }

//      int i = 0;
//      while (i < 10) {
//          i++;
//          System.out.println("Element: " + i);
//      }

//        int i = 100;
//        do {
//            System.out.println("Element: " + i);
//            i *= 10;
//        } while(i < 10);
    }
}
