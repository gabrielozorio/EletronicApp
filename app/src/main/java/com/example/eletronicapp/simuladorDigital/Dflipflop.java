package com.example.eletronicapp.simuladorDigital;

public class Dflipflop extends Component{

    private boolean clock;
    private boolean data;
    //private boolean reset;
    private boolean output;

    private boolean calculateOutput(){

    }

    private Dflipflop(boolean data, boolean clock){
        add();
        setType(Type.ff);
        this.data=data;
        this.clock=clock;
        this.output=false;
    }
}

