package com.itproger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite vartotojo tipą");
        String role = scanner.nextLine();
        if (role.equals("Admin")) {
//            .equals naudojama tik su String, vietoj ==
            System.out.println("Visi vartotojai");
        } else {
            System.out.println("Sveikas, koks tavo vardas?");
        }
    }
}
