package br.com.morita.service.generics;

import br.com.morita.domain.Persistente;
import br.com.morita.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService <T extends Persistente, E extends Serializable>{

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(E valor);

    public T consultar(E valor);

    public Collection<T> buscarTodos();

}
