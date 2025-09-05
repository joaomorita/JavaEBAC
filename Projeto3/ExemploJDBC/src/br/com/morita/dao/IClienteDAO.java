package br.com.morita.dao;

import br.com.morita.domain.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;

    Integer excluir(Cliente clienteDB) throws Exception;

    List<Cliente> buscarTodos() throws SQLException;

    Integer atualizar(Cliente clienteAtualizado) throws Exception;
}
