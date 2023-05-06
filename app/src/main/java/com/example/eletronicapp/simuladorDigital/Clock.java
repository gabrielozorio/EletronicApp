package com.example.eletronicapp.simuladorDigital;

public class Clock {
    static final private int defTicks = 4;
    private boolean clock=false;
    private boolean previous=false;
    static private int cycle=0;

    public enum transition{
        DOWN,
        UP,
        STAY
    }

    private int lastTick;
    public int getCycle() {
        return cycle;
    }
    public int getLastTick() { return lastTick; }
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
         // caso onde o clock chegou no ultimo ciclo, nao faz nada
                           // talvez ainda mude isso



            previous = this.clock;
            if (change) {  // se é dado o comando para o relogio avancar
                clock = !clock; // clock atual inverte
                if ((!previous) && (clock)) { // se o anterior era 0 e o atual é 1, ocorreu transicao de subida
                    troca = transition.UP;
                }
                if ((previous) && (!clock)) { // se o anterior era 1 e o atual é 0, ocorreu transicao de descida
                    troca = transition.DOWN;
                }
            } else {
                troca = transition.STAY; // passou uma unidade de tempo e o relogio nao foi alterado
                   }
            if (cycle < lastTick) {
                cycle++;
            }
        }



        public Clock(boolean init, int ticks) // construtor
        {
            if (ticks==0) {ticks=defTicks;} // se o usuario inicializa com 0
                                            // o construtor usa o valor padrao

            this.clock = init;
            this.lastTick = ticks;
         }

         public Clock()
         {

         }
         public void setClock(boolean init) {this.clock=init; }

    public void setLastTick(int lastTick) {this.lastTick = lastTick;}
}

