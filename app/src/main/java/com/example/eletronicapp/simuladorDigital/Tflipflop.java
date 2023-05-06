package com.example.eletronicapp.simuladorDigital;

public class Tflipflop extends Component {

    private boolean clock;
    private boolean data;
    //private boolean reset;
    //private boolean preset;
    private boolean output;
    private boolean previous;

    public boolean calculateOutput(Clock relogio){

        if (relogio.getTroca() == Clock.transition.UP)
        {
            output = !data;
        }
      //  if (reset = true) {
         //   output = false;
       // }
       // if (preset = true) {output=true;}
        return output;
    }

    public boolean calculateOutput()
    {
        if (Component.relogio.getTroca()==Clock.transition.UP)
        {
            output=!data;
        }
        return output;
    }


    public void updateData(boolean novo)
    {
        data=novo;
    }




      /*  if (reset = true) {
            output = false;
        }
        if (preset = true) {output=true;} */




    public Tflipflop(boolean data){
        add(); // conta quantidade de componentes
        setType(Type.T); // tipo do componente
        this.data=data;

         // por padrao, set e preset desarmados
        /*this.reset=false;
        this.preset=false;*/

    }
}
