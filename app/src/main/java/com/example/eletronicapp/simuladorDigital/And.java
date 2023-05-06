package com.example.eletronicapp.simuladorDigital;

public class And extends Component {


    private boolean input1;
    private boolean input2;
    private boolean output;
    private boolean calculateOutput()
    {
        return input1 && input2;
    }

    public void update(boolean n1, boolean n2) {
        input1=n1;
        input2=n2;
        output=input1&&input2;
    }

    public boolean getOutput() {
        return output;
    }

    public And(boolean input1, boolean input2)

    {
        add();
        setType(Type.AND);
        this.input1 = input1;
        this.input2 = input2;
        this.output = calculateOutput();
    }
}
