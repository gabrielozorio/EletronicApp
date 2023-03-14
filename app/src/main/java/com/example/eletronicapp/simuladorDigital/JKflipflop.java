package com.example.eletronicapp.simuladorDigital;

public class JKflipflop extends Component{

    private boolean j;
    private boolean k;
    private boolean clock;
    private boolean output;

    private boolean calculateOutput() {
        if (j && !k) {
            return true;
        } else if (!j && k) {
            return false;
        } else if (!j && k) {
            if (clock) {
                return !output;
            } else {
                return output;
            }
        } else {
            return output;
        }
    }

    public JKflipflop(boolean j, boolean k, boolean clock) {
        add();
        setType(Type.JK);
        this.j = j;
        this.k = k;
        this.clock = clock;
        this.output = false;
    }
    public void update(boolean j, boolean k, boolean clock) {
        this.j = j;
        this.k = k;
        this.clock = clock;
        this.output = calculateOutput();
    }

}
