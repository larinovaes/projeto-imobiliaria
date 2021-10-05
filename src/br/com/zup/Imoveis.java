package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imoveis {
    private String endereço;
    private double valorDoAluguel;
    private FuncionarioResponsavel funcionarioResponsavel;
    private List<Moradores> moradores = new ArrayList<>();

    public Imoveis(String endereço, double valorDoAluguel,FuncionarioResponsavel funcionarioResponsavel) {
        this.endereço = endereço;
        this.valorDoAluguel = valorDoAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public List<Moradores> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Moradores> moradores) {
        this.moradores = moradores;
    }
    public Moradores adicionarMorador(Moradores novoMorador){
        moradores.add(novoMorador);
        return novoMorador;
    }
    public Moradores removerMorador(Moradores removerMorador){
        moradores.remove(removerMorador);
        return removerMorador;
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
        dados.append("\nEndereço: " +getEndereço());
        dados.append("\nValor do aluguel: "+getValorDoAluguel());
        dados.append("\n------- Moradores ------ "+getMoradores());
        dados.append("\n -------- Funcionario responsavel --------- " +getFuncionarioResponsavel());
        return dados.toString();
    }
}
