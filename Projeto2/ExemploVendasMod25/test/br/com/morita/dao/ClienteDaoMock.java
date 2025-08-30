package br.com.morita.dao;

import br.com.morita.domain.Cliente;
import br.com.morita.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;
import java.util.List;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }
}
