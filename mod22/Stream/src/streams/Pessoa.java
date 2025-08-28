package streams;

import java.util.List;
import java.util.Objects;

public class Pessoa {
    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa() {
        
    }

    public Pessoa(String id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Pessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getNacionalidade(), pessoa.getIdade());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> populaPessoas() {
        Pessoa p1 = new Pessoa("p1", "Paulo Almeida", "Brasil", 23);
        Pessoa p2 = new Pessoa("p2", "Pablo Almada", "Argentina", 20);
        Pessoa p3 = new Pessoa("p3", "Gutierrez", "Mexico", 23);
        Pessoa p4 = new Pessoa("p4", "Joaquim", "Mexico", 28);
        Pessoa p5 = new Pessoa("p5", "João Morita", "Brasil", 28);
        return List.of(p1, p2, p3, p4, p5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}
