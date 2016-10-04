package com.wy.transfer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jarvis on 16/10/3.
 */
public class ArabicToRomanTest {
    private ArabicToRoman araToRom;

    @Before
    public void setUp() throws Exception {
        araToRom = new ArabicToRoman();
    }

    @Test
    public void test1toI() throws Exception {
        assertEquals("I",araToRom.araToRom("1"));
    }

    @Test
    public void test3toIII() throws  Exception {
        assertEquals("III",araToRom.araToRom("3"));
    }

    @Test
    public void test5toV() throws  Exception {
        assertEquals("V",araToRom.araToRom("5"));
    }

    @Test
    public void test4toIV() throws  Exception {
        assertEquals("IV",araToRom.araToRom("4"));
    }

    @Test
    public void test10toX() throws  Exception {
        assertEquals("X",araToRom.araToRom("10"));
    }

    @Test
    public void test15toXV() throws  Exception {
        assertEquals("XV",araToRom.araToRom("15"));
    }

    @Test
    public void test20toXX() throws  Exception {
        assertEquals("XX",araToRom.araToRom("20"));
    }

    @Test
    public void test19toXIX() throws  Exception {
        assertEquals("XIX",araToRom.araToRom("19"));
    }

    @Test
    public void test41toXLI() throws  Exception {
        assertEquals("XLI",araToRom.araToRom("41"));
    }

    @Test
    public void test50toXLIX() throws  Exception {
        assertEquals("L",araToRom.araToRom("50"));
    }

    @Test
    public void test90toXC() throws  Exception {
        assertEquals("XC",araToRom.araToRom("90"));
    }

    @Test
    public void test100toC() throws  Exception {
        assertEquals("C",araToRom.araToRom("100"));
    }

    @Test
    public void test101toCI() throws  Exception {
        assertEquals("CI",araToRom.araToRom("101"));
    }

    @Test
    public void test400toCD() throws  Exception {
        assertEquals("CD",araToRom.araToRom("400"));
    }

    @Test
    public void test5066toMMMMMLXVI() throws Exception {
        assertEquals("MMMMMLXVI",araToRom.araToRom("5066"));
    }

    @Test
    public void test5000toMMMMM() throws Exception {
        assertEquals("MMMMM",araToRom.araToRom("5000"));
    }
    @Test
    public void test1000toM() throws Exception {
        assertEquals("M",araToRom.araToRom("1000"));
    }
    @Test
    public void test899toDCCCXCIX() throws Exception {
        assertEquals("DCCCXCIX",araToRom.araToRom("899"));
    }



}