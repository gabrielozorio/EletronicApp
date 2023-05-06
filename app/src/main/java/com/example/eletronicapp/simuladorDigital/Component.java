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

    // public enum Type{gate,ff}
    public enum Type{NOT,OR,NOR,AND,NAND,XOR,XNOR,RS,JK,D,T} // tipos de componentes
    static Clock relogio; // relogio compartilhado para circuitos sincronos

    public static void setRelogio(Clock relogio) {
        Component.relogio = relogio;
    }

    public void add(){
        active++;
    }

    public Component(){
        // active++;
       /* switch(type){
            case D:

            case T:

            case RS:

            case JK:

        }*/


    }
    
}