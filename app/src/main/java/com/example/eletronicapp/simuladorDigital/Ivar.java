package com.example.eletronicapp.simuladorDigital;

public class Ivar extends Variable {

    private char name;

    public Ivar(String name) throws IllegalArgumentException {
        if (name.length() != 1 || !Character.isUpperCase(name.charAt(0))) {
            throw new IllegalArgumentException("Invalid IVAR name");
        }
        add();
        this.name = name.charAt(0);
    }
}
