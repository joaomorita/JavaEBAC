package br.com.morita.reflections;

public class Produto {

    private Long codigo;

    private String descricao;

    private Double valor;

    public Long getCodigo() {
        return codigo;
    }

    public Produto() {}

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
