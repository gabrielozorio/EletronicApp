package com.example.eletronicapp.simuladorDigital;

public class RSflipflop extends Component{

    private boolean s;
    private boolean r;
    private boolean output;

    private boolean calculateOutput() {
        if (s && !r) {
            return true;
        } else if(!s && r) {
            return false;
        } else {
            return output;
        }
    }


    public RSflipflop(boolean s, boolean r) {
        setType(Type.RS);
        this.s = s;
        this.r = r;
        this.output = calculateOutput();
    }




    public boolean getOutput() {
        return output;
    }
}
