package com.itproger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Įveskite savo varda");
//        String username = scan.nextLine();
//        System.out.println("Hello, " + username);
//        int num1 = scan.nextInt();
//        byte num2 = scan.nextByte();
//        boolean b = scan.nextBoolean();

        int num1 = 50, num2 = 33;
        float res = num1 % num2;

        res *= 10;
        System.out.println("Rezultatas: " + res);
    }

}
