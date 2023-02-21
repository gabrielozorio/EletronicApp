package com.example.eletronicapp.simuladorDigital;

public class Nand extends Component {
    private boolean input1;
    private boolean input2;
    private boolean output;

    private boolean calculateOutput(boolean input1, boolean input2)
    {
        return !(input1 && input2);
    }

    public Nand(boolean input1, boolean input2)
    {
        add();
        setType(Component.Type.gate);
        this.input1 = input1;
        this.input2 = input2;
        this.output = calculateOutput(input1,input2);
    }
}