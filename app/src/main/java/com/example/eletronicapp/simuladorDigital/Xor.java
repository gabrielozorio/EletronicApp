package com.example.eletronicapp.simuladorDigital;

public class Xor extends Component{

    private boolean input1;
    private boolean input2;
    private boolean output;

    private boolean calculateOutput(){
        return ((!input1&&input2)||(input1&&!input2));
    }

    public Xor(boolean input1, boolean input2)
    {
        add();
        setType(Type.gate);
        this.input1 = input1;
        this.input2 = input2;
        this.output = calculateOutput();
    }
}
