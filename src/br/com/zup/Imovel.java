package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorDoAluguel;
    private FuncionarioResponsavel funcionarioResponsavel;
    private List<Morador> moradores = new ArrayList<>();

    public Imovel(String endereco, double valorDoAluguel, FuncionarioResponsavel funcionarioResponsavel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    public Morador adicionarMorador(Morador novoMorador) {
        moradores.add(novoMorador);
        return novoMorador;
    }

    public FuncionarioResponsavel getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(FuncionarioResponsavel funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nEndereço: " + getEndereco());
        dados.append("\nValor do aluguel: " + getValorDoAluguel());
        dados.append("\n------- Moradores ------ " + getMoradores());
        dados.append("\n -------- Funcionario responsavel --------- " + getFuncionarioResponsavel());
        return dados.toString();
    }
}
