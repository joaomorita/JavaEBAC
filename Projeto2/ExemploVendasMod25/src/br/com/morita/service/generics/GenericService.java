package br.com.morita.service.generics;

import br.com.morita.dao.generics.IGenericDAO;
import br.com.morita.domain.Persistente;
import br.com.morita.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class GenericService <T extends Persistente, E extends Serializable> implements IGenericService<T, E> {

    protected IGenericDAO<T, E> dao;

    public GenericService(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        this.dao.alterar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.dao.excluir(valor);
    }

    @Override
    public T consultar(E valor) {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }
}
