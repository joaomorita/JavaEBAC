package br.com.morita;

import br.com.morita.dao.ClienteDAO;
import br.com.morita.dao.IClienteDAO;
import br.com.morita.domain.Cliente;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Joao Silva");

        Integer qtd = dao.cadastrar(cliente);

        Assert.assertTrue(qtd == 1);

        Cliente clienteDB = dao.consultar(cliente.getCodigo());
        Assert.assertNotNull(clienteDB);
        Assert.assertNotNull(clienteDB.getId());
        Assert.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteDB.getNome());

        Integer qtdDel = dao.excluir(clienteDB);
        Assert.assertNotNull(qtdDel == 1);

    }

    @Test
    public void consultarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();
        // instancia o cliente
        Cliente cliente = new Cliente();

        // cria o novo cliente
        cliente.setCodigo("01");
        cliente.setNome("Joao");

        // salva o cliente no banco dentro de uma variável
        Integer qtde = dao.cadastrar(cliente);

        // verifica se existe uma entrada no banco
        Assert.assertTrue(qtde == 1);

        // Compara se o clienteDB é igual ao cliente
        Cliente clienteDB = dao.consultar("01");
        Assert.assertNotNull(clienteDB);
        Assert.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteDB.getNome());

        // deleta do banco
        Integer qtdDel = dao.excluir(clienteDB);

        // confere se foi deletado
        Assert.assertTrue(qtdDel == 1);
    }

    @Test
    public void excluirTest() throws Exception {

        // cria instancia do dao
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Joao");
        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        Cliente clienteDB = dao.consultar("01");
        Assert.assertNotNull(clienteDB);
        Assert.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteDB.getNome());

        Integer qtdDel = dao.excluir(cliente);
        Assert.assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception{
        IClienteDAO dao = new ClienteDAO();

        // Cria cliente 1
        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Joao");
        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        // Cria clliente 2
        Cliente cliente1 = new Cliente();
        cliente1.setCodigo("02");
        cliente1.setNome("José");
        Integer qtd2 = dao.cadastrar(cliente1);
        Assert.assertTrue(qtd2 == 1);

        List<Cliente> listaCliente = dao.buscarTodos();
        Assert.assertNotNull(listaCliente);
        Assert.assertTrue(listaCliente.size() == 2);

        int contador = 0;
        for (Cliente cli : listaCliente) {
            dao.excluir(cli);
            contador++;
        }

        Assert.assertEquals(contador, 2);

        listaCliente = dao.buscarTodos();
        Assert.assertEquals(listaCliente.size(), 0);
    }

    @Test
    public void atualizaClienteTest() throws Exception {
        // cria instancia do DAO
        IClienteDAO dao = new ClienteDAO();

        // Cria cliente
        Cliente cliente = new Cliente();

        // Cadastra dados do cliente
        cliente.setCodigo("01");
        cliente.setNome("Joao");
        Integer qtd = dao.cadastrar(cliente);

        // Verifica se existe um cliente
        Assert.assertTrue(qtd == 1);
        // Busca o cliente cadastrado
        Cliente clienteAtualizado = dao.consultar("01");

        // Checa se não é nulo
        Assert.assertNotNull(clienteAtualizado);
        Assert.assertEquals(cliente.getCodigo(), clienteAtualizado.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteAtualizado.getNome());

        // Faz a atualização do cliente
        clienteAtualizado.setCodigo("02");
        clienteAtualizado.setNome("Joao Atualizado");
        Integer contadorUpd = dao.atualizar(clienteAtualizado);
        Assert.assertTrue(contadorUpd == 1);

        // Checa se o cliente com o código antigo foi deletado
        Cliente clienteDB2 = dao.consultar("01");
        Assert.assertNull(clienteDB2);

        //Coloca o cliente com cod 02 em uma variável e confere se está igual ao clienteAtualizado
        Cliente clienteDB3 = dao.consultar("02");
        Assert.assertNotNull(clienteDB3);
        Assert.assertEquals(clienteAtualizado.getId(), clienteDB3.getId());
        Assert.assertEquals(clienteAtualizado.getCodigo(), clienteDB3.getCodigo());
        Assert.assertEquals(clienteAtualizado.getNome(), clienteDB3.getNome());

        // Deleta todos
        List<Cliente> listaCliente = dao.buscarTodos();
        for (Cliente cli : listaCliente) {
            dao.excluir(cli);
        }

    }

}
