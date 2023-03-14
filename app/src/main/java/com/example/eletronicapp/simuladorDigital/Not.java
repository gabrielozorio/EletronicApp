package com.example.eletronicapp.simuladorDigital;

public class Not extends Component{

    private boolean input;
    private boolean output;

    private boolean calculateOutput(boolean input)
    {
        return !input;
    }

    public Not(boolean input)
    {
        // add();
        setType(Type.NOT);
        this.input = input;
        this.output = calculateOutput(input);
    }
}
