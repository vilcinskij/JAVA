package com.itproger;

public class Main {

    public static void main(String[] args) {

        Transport bmw = new Transport();
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinste = new byte[] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinste = new byte[] {100, 0, 100};
    }
}
