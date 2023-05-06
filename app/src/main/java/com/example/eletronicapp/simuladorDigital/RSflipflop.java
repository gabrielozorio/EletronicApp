package com.example.eletronicapp.simuladorDigital;

public class RSflipflop extends Component{

    private boolean s;
    private boolean r;
    private boolean output;

    public boolean updateOutput() {

        if(Component.relogio.getTroca()==Clock.transition.UP)
        {
            if (s && !r) {
                return true;
            }
            if (!s && r) {
                return false;
            } else {
                return output;
            }
        }
        return output;
    }

    public boolean updateOutput(Clock relogio)
    {
        if(relogio.getTroca()==Clock.transition.UP)
        {
            if (s && !r) {
                return true;
            }
            if (!s && r) {
                return false;
            } else {
                return output;
            }
        }
        return output;
    }


    public RSflipflop(boolean s, boolean r) {
        setType(Type.RS);
        this.s = s;
        this.r = r;

    }




    public boolean getOutput() {
        return output;
    }
}
