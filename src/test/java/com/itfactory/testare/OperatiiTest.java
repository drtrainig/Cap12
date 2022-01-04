package com.itfactory.testare;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperatiiTest {
    private Operatii operatii;

    @Before
    public void init() {
        operatii = new Operatii();
    }

    @Test
    public void testareSuma() {
        int suma = operatii.suma(5, 3);
        assertEquals(8, suma);
    }

    @Test
    public void testareDiferenta() {
        int diferenta = operatii.diferenta(10, 5);
        assertEquals(5, diferenta);
    }

}
