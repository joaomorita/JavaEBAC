package br.com.morita.testes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeiroTesteTest {

    @Test
    public void primeiroTeste() {
        String name = "Morita";
        Assert.assertEquals("Morita", name);
    }

    @Test
    public void primeitoTesteNotEquals() {
        String name = "Morita";
        Assert.assertNotEquals("Moritaa", name);
    }
}