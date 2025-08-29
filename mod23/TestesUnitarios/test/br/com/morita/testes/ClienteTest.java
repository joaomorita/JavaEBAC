package br.com.morita.testes;

import br.com.morita.Cliente;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void testeClasseCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        Assert.assertEquals("João", cliente.getNome());
    }
}
