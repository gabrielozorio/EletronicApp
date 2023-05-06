package com.example.eletronicapp.simuladorDigital;

public class Variable {

    static final int MAX_VARIABLES=4;
    static int active=0;

    private boolean value;

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() { return value; }

    public Variable() {
        add();
        value=false;
    }

    public void add(){ active++; }


}