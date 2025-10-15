package br.com.morita.produto_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produtos")
@Getter
@Setter
public class Produto {

    @Id
    private Long id;
    private int quantidade;
    private String nome;
    private String descricao;
    private double preco;

    public Produto() {}

    public Produto(int quantidade, String nome, String descricao, double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
