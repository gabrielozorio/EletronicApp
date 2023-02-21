package com.example.eletronicapp.simuladorDigital;

public class Variable {

    static final int MAX_VARIABLES=4;
    static int active=0;
    private Vtype type;
    public enum Vtype{IVAR,OVAR}

    public void setType(Variable.Vtype newVtype){
        type=newVtype;
    }
    public Variable.Vtype getType(){
        return type;
    }

    public Variable() {

    }

    public void add(){ active++; }


}