package com.example.eletronicapp.simuladorDigital;

public class Xor extends Component{

    private boolean input1;
    private boolean input2;
    private boolean output;

    public boolean getOutput() {
        return output;
    }

    public void update(boolean n1,boolean n2) {
        input1=n1;
        input2=n2;
        output=this.calculateOutput();
    }

    private boolean calculateOutput(){
        if ((input1)!=(input2)) {
            output=true;
            return output;
        }
        else
        {
            output=false;
            return output;
        }
    }

    public Xor(boolean input1, boolean input2)
    {
        add();
        setType(Type.XOR);
        this.input1 = input1;
        this.input2 = input2;
        this.output = calculateOutput();
    }
}
