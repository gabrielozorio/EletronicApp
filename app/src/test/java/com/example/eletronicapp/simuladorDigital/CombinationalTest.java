package com.example.eletronicapp.simuladorDigital;

import junit.framework.TestCase;

public class CombinationalTest extends TestCase {
    Nand generic = new Nand(false,false);
    public void testGeneric() {
        assertTrue(generic.getOutput());
        generic.update(false,true);
        assertTrue(generic.getOutput());
        generic.update(true,false);
        assertTrue(generic.getOutput());
        generic.update(true,true);

        assertFalse(generic.getOutput());


    }

    Nand ff = new Nand(false,false);
    public void testFF()

    {
        assertTrue(ff.getOutput());
    }
    Nand tt = new Nand(true,true);
    public void testTT()
    {
        assertFalse(tt.getOutput());
    }

    And testAnd = new And(false,false);
    public void testAnd1(){
        assertFalse(testAnd.getOutput());
        testAnd.update(false,true);
        assertFalse(testAnd.getOutput());
        testAnd.update(true,false);
        assertFalse(testAnd.getOutput());
        testAnd.update(true,true);
        assertTrue(testAnd.getOutput());
    }

    Or testOr = new Or(false,false);
    public void testOr1(){
        assertFalse(testOr.getOutput());
        testOr.update(false,true);
        assertTrue(testOr.getOutput());
        testOr.update(true,false);
        assertTrue(testOr.getOutput());
        testOr.update(true,true);
        assertTrue(testOr.getOutput());
    }
    Nor testNor = new Nor(false,false);
    public void testNor1(){
        assertTrue(testNor.getOutput());
        testNor.update(false,true);
        assertFalse(testNor.getOutput());
        testNor.update(true,false);
        assertFalse(testNor.getOutput());
        testNor.update(true,true);
        assertFalse(testNor.getOutput());
    }

    Xor testXor = new Xor(false,false);
    public void testXor1() {
        assertFalse(testXor.getOutput());
        testXor.update(false,true);
        assertTrue(testXor.getOutput());
        testXor.update(true,false);
        assertTrue(testXor.getOutput());
        testXor.update(true,true);
        assertFalse(testXor.getOutput());
    }

    Xnor testXnor = new Xnor(false,false);
    public void testXnor1() {

        assertTrue(testXnor.getOutput());
        testXnor.update(false,true);
        assertFalse(testXnor.getOutput());
        testXnor.update(true,false);
        assertFalse(testXnor.getOutput());
        testXnor.update(true,true);
        assertTrue(testXnor.getOutput());
    }

}