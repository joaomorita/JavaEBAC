public class Pessoa {
    private String nome;
    private Sexo sexo;


    public Pessoa(String nome, String sexoStr) {
        this.nome = nome;
        this.sexo = Sexo.paraString(sexoStr);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
