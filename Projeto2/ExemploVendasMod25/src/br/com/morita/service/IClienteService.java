package br.com.morita.service;

import br.com.morita.domain.Cliente;
import br.com.morita.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
