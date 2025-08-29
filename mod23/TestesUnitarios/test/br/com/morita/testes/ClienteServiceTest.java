package br.com.morita.testes;

import dao.ClienteDAO;
import dao.ClienteDAOMock;
import dao.IClienteDAO;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDAO mockDao = new ClienteDAOMock();

        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroSalvarTest() {
        IClienteDAO mockDao = new ClienteDAO();

        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso!", retorno);
    }

}
