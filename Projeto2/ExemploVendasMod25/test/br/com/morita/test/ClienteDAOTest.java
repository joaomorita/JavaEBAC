package br.com.morita.test;

import br.com.morita.dao.ClienteDAO;
import br.com.morita.dao.ClienteDaoMock;
import br.com.morita.dao.IClienteDAO;
import br.com.morita.domain.Cliente;
import br.com.morita.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();

        cliente.setNome("Morita");
        cliente.setCpf(12345678910L);
        cliente.setTelefone(12991129933L);
        cliente.setEndereco("Rua aparecida");
        cliente.setNumero(12);
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");

        clienteDAO.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        // busca o cliente cadastrado
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());

        // verifica se não é nulo
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("João");
        clienteDAO.alterar(cliente);

        Assert.assertEquals("João", cliente.getNome());
    }



}
