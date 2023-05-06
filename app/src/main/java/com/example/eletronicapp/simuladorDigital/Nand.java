package com.example.eletronicapp.simuladorDigital;

public class Nand extends Component {
    private boolean input1;
    private boolean input2;
    private boolean output;
    public void update(boolean n1, boolean n2)
    {
        input1=n1;
        input2=n2;
        output=calculateOutput();
    }
    public boolean getOutput(){
        return output;
    }

    private boolean calculateOutput() {

        return !(input1 && input2);
    }


    public Nand(boolean input1, boolean input2)
    {
        add();
        setType(Component.Type.NAND);
        this.input1 = input1;
        this.input2 = input2;
        this.output = calculateOutput();
    }
}