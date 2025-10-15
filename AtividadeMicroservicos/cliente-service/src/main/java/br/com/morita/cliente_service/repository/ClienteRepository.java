package br.com.morita.cliente_service.repository;

import br.com.morita.cliente_service.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
