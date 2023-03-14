package com.example.eletronicapp.simuladorDigital;

public class Tflipflop extends Component {

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
            output = !inData;
        }
        if (reset = true) {
            output = false;
        }
        if (preset = true) {output=true;}
        return output;
    }

    public boolean calculateOutput(boolean inData, boolean inClock)
    {
        if((!previous)  && (inClock)) {output = !inData;}

        previous = inClock;
        data = inData;

        if (reset = true) {
            output = false;
        }
        if (preset = true) {output=true;}

        return output;
    }


    public Tflipflop(boolean data, boolean clock, boolean output){
        add(); // conta quantidade de componentes
        setType(Type.T); // tipo do componente
        this.data=data;
        this.clock=clock;
        this.output=output; // por padrao, set e preset desarmados
        this.reset=false;
        this.preset=false;
        this.previous=clock;
    }
}
