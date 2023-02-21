package com.example.eletronicapp.simuladorDigital;

public class Ovar extends Variable {

    private char name;

    public Ovar(String name) throws IllegalArgumentException {
        if (name.length() != 1 || !Character.isUpperCase(name.charAt(0))) {
            throw new IllegalArgumentException("Invalid OVAR name");
        }
        this.name = name.charAt(0);
    }
}
