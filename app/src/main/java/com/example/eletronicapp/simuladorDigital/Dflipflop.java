package com.example.eletronicapp.simuladorDigital;

public class Dflipflop extends Component{

    private boolean clock;
    private boolean data;
    private boolean reset;
    private boolean preset;
    private boolean output;
    private boolean previous;


    public boolean calculateOutput(boolean inData,Clock relogio){
        data = inData;
        if (relogio.getTroca() == Clock.transition.UP)
        {
            output = inData;
        }
        if (reset = true) {
            output = false;
        }
        if (preset = true) {output=true;}
        return output;
    }


    private Dflipflop(boolean data, boolean clock){
        add();
        setType(Type.D);
        this.data=data;
        this.clock=clock;
        this.output=false;
    }
}

