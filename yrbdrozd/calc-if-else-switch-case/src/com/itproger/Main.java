package com.itproger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite pirmą skaičių");
        int s1 = scanner.nextInt();

        System.out.println("Įveskite antrą skaičių");
        int s2 = scanner.nextInt();

        int rez;

        System.out.println("Įveskite veiksmą (+, -, /, *)");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                rez = s1 + s2;
                System.out.println("Skaičių suma yra: " + rez);
                break;
            case "-":
                rez = s1 - s2;
                System.out.println("Skaičių skirtumas yra: " + rez);
                break;
            case "*":
                rez = s1 * s2;
                System.out.println("Skaičių sandauga yra: " + rez);
                break;
            case "/":
                if (s2 == 0)
                    System.out.println("Iš nulio dalinti negalima");
                else {
                    rez = s1 / s2;
                    System.out.println("Skaičių dalyba yra: " + rez);
                }
                break;
            default:
                System.out.println("Kažkas įvesta neteisingai");
        }

    }
}
