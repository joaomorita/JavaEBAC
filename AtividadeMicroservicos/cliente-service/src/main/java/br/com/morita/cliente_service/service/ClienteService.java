package br.com.morita.cliente_service.service;

import br.com.morita.cliente_service.model.Cliente;
import br.com.morita.cliente_service.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listaTodos() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).get();
    }

    public Cliente cadastrar (Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void remover(Long id) {
        clienteRepository.deleteById(id);
    }
}
