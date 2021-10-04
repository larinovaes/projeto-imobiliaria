package br.com.zup;

public class Main {

    public static void main(String[] args) {

        Imobiliaria imobiliaria = new Imobiliaria();
        FuncionarioResponsavel funcionarioResponsavel = new FuncionarioResponsavel("Joaquim", "0172356", 59);
        Moradores morador1 = new Moradores("Joao", "092737", 23);
        Moradores morador2 = new Moradores("Larissa","18263",45);
        Imoveis imoveis = new Imoveis("Rua miguel", 1400,funcionarioResponsavel);
        imoveis.adicionarMorador(morador1);
        imoveis.adicionarMorador(morador2);
        System.out.println(imobiliaria.adicionarImovel(imoveis));

    }
}
