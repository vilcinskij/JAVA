package com.itproger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite vartotojo tipą");
        String role = scanner.nextLine();
        System.out.println("Įveskite slaptažodi");
        String pass = scanner.nextLine();
        if (role.equals("Admin") && pass.equals("Admin")) {
//            .equals naudojama tik su String, vietoj ==
            System.out.println("Visi vartotojai");
        } else {
            System.out.println("Sveikas, įvesk skaičiu nuo 1 iki 5");
            int num = scanner.nextInt();
//            switch & case daugkartinis IF ELSE
            switch (num) {
                case 1:
                    System.out.println("Skaičius vienas");
                    break;
                case 2:
                    System.out.println("Skaičius du");
                    break;
                case 3:
                    System.out.println("Skaičius trys");
                    break;
                case 4:
                    System.out.println("Skaičius keturi");
                    break;
                case 5:
                    System.out.println("Skaičius penki");
                    break;
                default:
//                    default kaip ELSE, gali ir nebūti, galima ir nerašyti breake
                    System.out.println("Default");
            }
        }
    }
}
