package com.example.eletronicapp.simuladorDigital;

public class Component {

    static int active=0;
    private Type type;

    public void setType(Type newType){
        type=newType;
    }
    public Type getType(){
        return type;
    }

    public enum Type{gate,ff}

    public void add(){
        active++;
    }

    public Component(){
        // active++;
    }

}