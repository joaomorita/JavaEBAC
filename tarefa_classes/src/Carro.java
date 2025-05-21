public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private boolean ligado;
    private int ano;

    public Carro(String marca, String modelo, String cor, boolean ligado, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false; // O carro começa desligado
        this.ano = ano;
    }

    // Métodos
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("Carro acelerado.");
        } else {
            System.out.println("Ligue o carro para poder acelerar");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }
}
