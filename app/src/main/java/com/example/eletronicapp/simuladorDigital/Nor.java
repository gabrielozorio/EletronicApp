package com.example.eletronicapp.simuladorDigital;

public class Nor extends Component {
    private boolean input1;
    private boolean input2;
    private boolean output;

    private boolean calculateOutput(boolean input1, boolean input2)
    {
        return !(input1 || input2);
    }

    public Nor(boolean input1, boolean input2)

    {
        add();
        setType(Type.NOR);
        this.input1 = input1;
        this.input2 = input2;
        this.output = calculateOutput(input1,input2);
    }

    public void update(boolean newInput1, boolean newInput2)
    {
        this.input1 = newInput1;
        this.input2 = newInput2;
        this.output = calculateOutput(newInput1,newInput2);
    }

    public boolean getOutput(){
        return output;
    }
}