package com.example.eletronicapp.simuladorDigital;

public class Circuit {
    private Component[] componentes;
    private Variable[] variables;
    private Simtype[] simulation;
    private static int freeCompSlot=0;
    public Circuit(Component[] componentes, Variable[] variables){
        this.componentes = componentes;
        this.variables = variables;
    }

    public void addComponent(Component.Type tipo, boolean input1, boolean input2)
    {
        switch (tipo)
        {
            case not:
            Not()
        }
    }


}
