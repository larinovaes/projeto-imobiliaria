package br.com.zup;

public class Morador extends Pessoa {
    private String emailDoMorador;

    public Morador(String nome, String cpf, int idade, String emailDoMorador) {
        super(nome, cpf, idade);
        this.emailDoMorador = emailDoMorador;
    }

    public String getEmailDoMorador() {
        return emailDoMorador;
    }

    public void setEmailDoMorador(String emailDoMorador) {
        this.emailDoMorador = emailDoMorador;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome: " + getNome());
        dados.append("\nCPF: " + getCpf());
        dados.append("\nIdade: " + getIdade());
        dados.append("\nEmail do morador: " + getEmailDoMorador());
        return dados.toString();
    }
}
