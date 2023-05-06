package com.example.eletronicapp.simuladorDigital;

public class Nor extends Component {
    private boolean input1;
    private boolean input2;
    private boolean output;

    private boolean calculateOutput()
    {
        return !(input1 || input2);
    }

    public boolean getOutput(){
        return output;
    }

    public void update(boolean n1, boolean n2){
        input1=n1;
        input2=n2;
        output=calculateOutput();
    }

    public Nor(boolean input1, boolean input2)

    {
        add();
        setType(Type.NOR);
        this.input1 = input1;
        this.input2 = input2;
        this.output = calculateOutput();
    }


}