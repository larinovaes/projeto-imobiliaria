package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("****** BEM VINDOS A IMOBILIARIA LUZ *******");
        System.out.println("Digite [1] para adicionar Imóvel e moradores");
        System.out.println("Digite [2] para ver catalgo de imoveis com morador");
        System.out.println("Digite [3] para remover morador");
        System.out.println("Digite [4] para sair do programa");
    }

    public static FuncionarioResponsavel adicionarResponsavel() {
        String nomeDoResponsavel = dadosUsarios("Digite o nome do responsavel pelo o imovel:").nextLine();
        String cpfDoResponsavel = dadosUsarios("Digite o CPF do responsavel pelo o imovel: ").nextLine();
        int ctpsDoResponsavel = dadosUsarios("Digite o numero da ctps do responsavel pelo o imovel: ").nextInt();
        FuncionarioResponsavel funcionarioResponsavel = new FuncionarioResponsavel(nomeDoResponsavel, cpfDoResponsavel,ctpsDoResponsavel);
        return funcionarioResponsavel;
    }

    public static Moradores adicionarMorador() {
        String nomeDoMorador = dadosUsarios("Digite o nome do morador:").nextLine();
        String cpf = dadosUsarios("Digite o CPF do morador: ").nextLine();
        int idadeDoMorador = dadosUsarios("Digite a idade do morador: ").nextInt();
        Moradores morador = new Moradores(nomeDoMorador, cpf, idadeDoMorador);
        return morador;
    }

    public static Imoveis criarImovel() {
        String endereço = dadosUsarios("Digite o endereço do imovel: ").nextLine();
        double valorDoAluguel = dadosUsarios("Digite o valor do aluguel: ").nextDouble();
        Imoveis imoveis = new Imoveis(endereço, valorDoAluguel, adicionarResponsavel());
        return imoveis;
    }

    public static void executarSistem() {

        Imobiliaria imobiliaria = new Imobiliaria();
        boolean menu = true;

        while (menu) {
            menu();
            int opcao = dadosUsarios("Qual sua escolha?").nextInt();
            if (opcao == 1) {
               Imoveis imoveis = criarImovel();
                for (int i = 1; i < 4; i++) {
                    System.out.println("Morador "+ i +": ");
                    Moradores morador = adicionarMorador();
                    imoveis.adicionarMorador(morador);
                }
               imobiliaria.adicionarImovel(imoveis);
            }
            else if (opcao == 2){
                System.out.println(imobiliaria);
            }
            else if(opcao == 3){

            }
            else{
                System.out.println("Voce saiu do programa");
                menu = false;
            }
        }
    }
}
