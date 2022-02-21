package com.itproger;

public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public Transport(float _speed, int _weight, String _color, byte[] _coordinate) {
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
    }

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " +  color + ".\n";
        String infoCoordinates = "Coordinates:\n";

        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        };
        return info + infoCoordinates;
    }

}
