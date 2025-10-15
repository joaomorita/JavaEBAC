package br.com.morita.produto_service.repository;

import br.com.morita.produto_service.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
