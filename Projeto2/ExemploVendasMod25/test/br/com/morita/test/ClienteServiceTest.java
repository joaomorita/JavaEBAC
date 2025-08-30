package br.com.morita.test;

import br.com.morita.dao.ClienteDaoMock;
import br.com.morita.dao.IClienteDAO;
import br.com.morita.domain.Cliente;
import br.com.morita.exceptions.TipoChaveNaoEncontradaException;
import br.com.morita.service.ClienteService;
import br.com.morita.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private Cliente cliente;

    private IClienteService clienteService;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();

        cliente.setNome("Morita");
        cliente.setCpf(12345678910L);
        cliente.setTelefone(12991129933L);
        cliente.setEndereco("Rua aparecida");
        cliente.setNumero(12);
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
    }

    @Test
    public void pesquisarCliente(){
        // busca o cliente cadastrado
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        // verifica se não é nulo
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        // Salva o cliente
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarrCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("João");
        clienteService.alterar(cliente);

        Assert.assertEquals("João", cliente.getNome());
    }
}
