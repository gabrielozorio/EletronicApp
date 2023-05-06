package com.example.eletronicapp.simuladorDigital;

public class Dflipflop extends Component{

    //private boolean clock;
    private boolean data;
    //private boolean reset;
    //private boolean preset;
    private boolean output;

    public boolean getData() {
        return data;
    }

    public boolean getOutput() {
        return output;

    }

    public void updateData(boolean novo) {
        data = novo;
    }

    public boolean updateOutput(Clock relogio){

        if (relogio.getTroca() == Clock.transition.UP)
        {
            output = data;
        }
      //  if (reset = true) {
      //      output = false;
      //  }
       // if (preset = true) {output=true;}
        return output;
    }

    public boolean updateOutput()
    {
        if(Component.relogio.getTroca()==Clock.transition.UP)
        {
            output = data;
        }
        return output;
    }


    public Dflipflop(boolean data){
        add();
        setType(Type.D);
        this.data=data;

        this.output=false;
    }
}

