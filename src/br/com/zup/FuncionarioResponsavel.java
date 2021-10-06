package br.com.zup;

public class FuncionarioResponsavel extends Pessoa {
    private int numeroDaCpts;

    public FuncionarioResponsavel(String nome, String cpf, int idade, int numeroDaCpts) {
        super(nome, cpf, idade);
        this.numeroDaCpts = numeroDaCpts;
    }

    public int getNumeroDaCpts() {
        return numeroDaCpts;
    }

    public void setNumeroDaCpts(int numeroDaCpts) {
        this.numeroDaCpts = numeroDaCpts;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome: " + getNome());
        dados.append("\nCPF: " + getCpf());
        dados.append("\nIdade: " + getIdade());
        dados.append("\nNúmero da CPTS" + getNumeroDaCpts());
        return dados.toString();
    }
}
