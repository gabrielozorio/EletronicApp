package com.example.eletronicapp.simuladorDigital;

import junit.framework.TestCase;



public class SequentialTest extends TestCase {
    Clock relog = new Clock (false,0);
    Dflipflop dTeste = new Dflipflop(true);
    public void testD() {

        assertFalse(dTeste.getOutput()); // teste se a saída começa em 0
        relog.tick(true); // transicao de subida, ff tem que atualizar
        assertEquals(Clock.transition.UP,relog.getTroca()); // verifica a transicao

        dTeste.updateOutput(relog); // saída vai pra 1
        assertTrue(dTeste.getOutput()); // confere se a saída foi pra 1
        relog.tick(true); // relogio sai de 1 pra 0 ==> transicao de descida
        dTeste.updateData(false); // entrada do FF vai para 0
        dTeste.updateOutput(relog); // nada acontece, pois nao eh transicao de subida
        assertTrue(dTeste.getOutput()); // a saida continua em 1
        relog.tick(false); // o relogio ficou parado
        assertEquals(Clock.transition.STAY,relog.getTroca());

        dTeste.updateOutput(relog); // portanto nada muda na saida do FF
        assertTrue(dTeste.getOutput()); // continua 1

        dTeste.updateData(false); // entrada=0
        relog.tick(true); // relogio sai de 0 para 1
        dTeste.updateOutput(relog); // a transicao eh de subida data=0, output=data
        assertFalse(dTeste.getOutput());
        assertEquals(Clock.transition.UP,relog.getTroca());
    }

}