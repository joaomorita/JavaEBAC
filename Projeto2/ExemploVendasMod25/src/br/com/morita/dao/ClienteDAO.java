package br.com.morita.dao;

import br.com.morita.dao.generics.GenericDAO;
import br.com.morita.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setTelefone(entity.getTelefone());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEndereco(entity.getEndereco());
        entityCadastrado.setNumero(entity.getNumero());
    }
}
