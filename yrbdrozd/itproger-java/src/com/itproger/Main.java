package com.itproger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Įveskite savo varda");
        String username = scan.nextLine();
        System.out.println("Hello, " + username);
    }

}
