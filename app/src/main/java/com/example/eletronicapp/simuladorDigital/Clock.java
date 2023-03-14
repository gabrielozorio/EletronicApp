package com.example.eletronicapp.simuladorDigital;

public class Clock {
    private boolean clock=false;
    private boolean previous=false;
    private int cycle=0;

    public enum transition{
        DOWN,
        UP,
        STAY
    }

    private int lastTick;
    public int getCycle() {
        return cycle;
    }

    public transition getTroca() {
        return troca;
    }

    public boolean getClock(){
        return clock;
    }

    private transition troca=transition.STAY;

    public void tick(boolean change) // funcao que faz o relogio funcionar e registra o estado
                                    // e as transiçoes
    {
        previous = this.clock;
        if (change) {
            clock = !clock;
            if ((!previous) && (clock)) {
                troca = transition.UP;
            }
            if ((previous) && (!clock)) {
                troca = transition.DOWN;
            }
        } else {
            troca = transition.STAY;
        }
        if (cycle<lastTick)
        {
        cycle++;
        }
    }


        public Clock(boolean init, int ticks) // construtor
        {
            this.clock = init;
            this.lastTick = ticks;
         }




    }

