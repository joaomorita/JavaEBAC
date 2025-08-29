package service;

import dao.ClienteDAO;
import dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDao) {
        this.clienteDAO = clienteDao;
    }

    public String salvar() {
        clienteDAO.salvar();
        return "Sucesso!";
    }
}
