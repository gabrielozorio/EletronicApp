package com.example.eletronicapp.simuladorDigital;

public class Tflipflop extends Component {

    private boolean clock;
    private boolean data;
    //private boolean reset;
    private boolean output;

    private boolean calculateOutput(){
        if

    }

    private Dflipflop(boolean data, boolean clock){
        add();
        setType(Component.Type.ff);
        this.data=data;
        this.clock=clock;
        this.output=false;
    }
}
