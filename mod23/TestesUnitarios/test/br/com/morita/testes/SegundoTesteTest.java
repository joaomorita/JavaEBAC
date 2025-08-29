package br.com.morita.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTesteTest {
    @Test
    public void test() {
        String nome = "João";
        Assert.assertEquals("João", nome);
    }
}
