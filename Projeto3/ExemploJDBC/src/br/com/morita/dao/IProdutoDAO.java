package br.com.morita.dao;

import br.com.morita.domain.Cliente;
import br.com.morita.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    Integer cadastrar(Produto prod) throws Exception;

    Produto consultar(String codigoProd) throws Exception;

    Integer excluir(Produto prodDB) throws Exception;

    List<Produto> buscarTodos() throws Exception;

    Integer atualizar(Produto produtoAtualizado) throws Exception;
}
