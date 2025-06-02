public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String sobrenome, String endereco, String cpf) {
        super(nome, sobrenome, endereco);
        this.cpf = cpf;
    }

    @Override
    public void exibirInfos() {
        System.out.println("Nome: " + getNome() + " possui o CPF: " + cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
