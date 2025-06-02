public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String sobrenome, String endereco, String cnjp) {
        super(nome, sobrenome, endereco);
        this.cnpj = cnjp;
    }

    @Override
    public void exibirInfos() {
        System.out.println("Essa empresa possui o CNPJ " + cnpj + " no nome de " + getNome());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
