package com.example.eletronicapp.simuladorDigital;

import junit.framework.TestCase;

public class ClockTest extends TestCase {
    Clock relogio = new Clock(false,16);
    int nCycles=0;
    public void testClock() {
        int ultimo = relogio.getLastTick();
        boolean stop = false;
        while (!stop) {
            relogio.tick(true);
            nCycles++;
            assertEquals(relogio.getCycle(),nCycles);
            if(relogio.getLastTick()==relogio.getCycle()) {stop=true;}
        }
    }

    Clock relogio2 = new Clock(false,0);
    public void testClock2() {
        assertEquals(4,relogio2.getLastTick());
    }
    Clock relogio3 = new Clock(false,2);
    public void testClock3() {
        boolean muda=true;
        relogio3.tick(muda);
        assertTrue(relogio3.getClock());
        assertEquals(Clock.transition.UP,relogio3.getTroca());

        boolean naomuda=false;
        relogio3.tick(naomuda);
        assertTrue(relogio3.getClock());
        assertEquals(Clock.transition.STAY,relogio3.getTroca());

        relogio3.tick(muda);
        assertFalse(relogio3.getClock());
        assertEquals(Clock.transition.DOWN,relogio3.getTroca());

        relogio3.tick(naomuda);
        assertEquals(Clock.transition.STAY,relogio3.getTroca());
        assertFalse(relogio3.getClock());
        //assertEquals(2,relogio3.getCycle());


    }

}