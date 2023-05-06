package com.example.eletronicapp.simuladorDigital;

public class JKflipflop extends Component{

    private boolean j;
    private boolean k;
    //private boolean clock;
    private boolean output;

    private boolean calculateOutput(Clock relogio) {
        if (relogio.getTroca() == Clock.transition.UP) {

            if (j && !k) {
                output = true;
                return output;
            }
            if (!j && k) {
                output = false;
                return output;
            }
            if (j && k) {
                return output;
            }
            if (!j && !k) {
                output = !output;
                return output;
            }
            return output;
        }


        return output;
    }

    private boolean calculateOutput() {
        if (Component.relogio.getTroca() == Clock.transition.UP) {

            if (j && !k) {
                output = true;
                return output;
            }
            if (!j && k) {
                output = false;
                return output;
            }
            if (j && k) {
                return output;
            }
            if (!j && !k) {
                output = !output;
                return output;
            }
            return output;
        }


            return output;
    }

    public JKflipflop(boolean j, boolean k) {
        add();
        setType(Type.JK);
        this.j = j;
        this.k = k;

        this.output = false;
    }
    public void updateInput(boolean j, boolean k) {
        this.j = j;
        this.k = k;


    }

}
