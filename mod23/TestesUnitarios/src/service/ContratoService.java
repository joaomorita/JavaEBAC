package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso na busca";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluido";
    }

    @Override
    public String alterar() {
        contratoDao.alterar();
        return "Alterado";
    }
}

// TODO
// Fazer métodos buscar, excluir e atualizar