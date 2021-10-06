package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private static void menu() {
        System.out.println("****** BEM VINDOS A IMOBILIARIA LUZ *******");
        System.out.println("Digite [1] para adicionar Imóvel e moradores");
        System.out.println("Digite [2] para ver catalgo de imoveis com morador");
        System.out.println("Digite [3] para remover morador");
        System.out.println("Digite [4] para sair do programa");
    }

    private static FuncionarioResponsavel adicionarResponsavel() {
        String nomeDoResponsavel = dadosUsarios("Digite o nome do responsavel pelo o imovel:").nextLine();
        String cpfDoResponsavel = dadosUsarios("Digite o CPF do responsavel pelo o imovel: ").nextLine();
        int idade = dadosUsarios("Digite a idade do responsavel:").nextInt();
        int ctpsDoResponsavel = dadosUsarios("Digite o numero da ctps do responsavel pelo o imovel: ").nextInt();
        FuncionarioResponsavel funcionarioResponsavel = new FuncionarioResponsavel(nomeDoResponsavel, cpfDoResponsavel, idade, ctpsDoResponsavel);
        return funcionarioResponsavel;
    }

    private static Moradores adicionarMorador() {
        String nomeDoMorador = dadosUsarios("Digite o nome do morador:").nextLine();
        String cpfDeUsuarioMorador = dadosUsarios("Digite o CPF do morador: ").nextLine();
        int idadeDoMorador = dadosUsarios("Digite a idade do morador: ").nextInt();
        String emailDoMorador = dadosUsarios("Digite o email do morador:").nextLine();
        Moradores morador = new Moradores(nomeDoMorador, cpfDeUsuarioMorador, idadeDoMorador, emailDoMorador);
        return morador;
    }

    private static boolean validarCpfExistente(Imobiliaria imobiliaria, Moradores morador) {
        // Percorrer minha lista de imóveis
        String cpf = morador.getCpf();
        for (Imoveis percorrerImoveis : imobiliaria.getImovel()) {
            // Percorrer todas as listas dos moradores
            for (Moradores percorrerMoradores : percorrerImoveis.getMoradores()) {
                if (percorrerMoradores.getCpf().equals(cpf)) {
                    // Este morador possui um CPF já cadastrado
                    return true;
                }
            }
        }
        return false;
    }

    private static Imoveis criarImovel() {
        String endereço = dadosUsarios("Digite o endereço do imovel: ").nextLine();
        double valorDoAluguel = dadosUsarios("Digite o valor do aluguel: ").nextDouble();
        Imoveis imoveis = new Imoveis(endereço, valorDoAluguel, adicionarResponsavel());
        return imoveis;
    }

    private static String removerMoradorPorCpf(Imobiliaria imobiliaria) {
        String cpf = dadosUsarios("Digite o CPF do morador a ser removido: ").nextLine();
        for (Imoveis percorrerImoveis : imobiliaria.getImovel()) {
            for (Moradores percorrerMoradores : percorrerImoveis.getMoradores()) {
                if (percorrerMoradores.getCpf().equals(cpf)) {
                    percorrerImoveis.getMoradores().remove(percorrerMoradores);
                    return "Morador removido";
                }
            }
        }
        return "Morador não cadastrado no sistema";
    }


    public static void executarSistem() {

        Imobiliaria imobiliaria = new Imobiliaria();
        boolean menu = true;

        while (menu) {
            menu();
            int opcao = dadosUsarios("Qual sua escolha?").nextInt();
            if (opcao == 1) {
                Imoveis imoveis = criarImovel();
                int qtdDeMoradores = dadosUsarios("Quantos moradores quer cadastrar no imóvel?").nextInt();
                for (int i = 0; i < qtdDeMoradores; i++) {
                    System.out.println("Morador: ");
                    Moradores morador = adicionarMorador();
                    for (Moradores pecorrendoMoradores : imoveis.getMoradores()) {
                        String cpf = morador.getCpf();
                        if (pecorrendoMoradores.getCpf().equals(cpf)) {
                            System.out.println("Esse morador já existe!");
                        }
                    }
                    imoveis.adicionarMorador(morador);
                }
                imobiliaria.adicionarImovel(imoveis);
            }
            else if (opcao == 2) {
                System.out.println(imobiliaria);
            } else if (opcao == 3) {
                String statusDeRemocao = removerMoradorPorCpf(imobiliaria);
                System.out.println(statusDeRemocao);
            } else {
                System.out.println("Voce saiu do programa");
                menu = false;
            }
        }
    }
}
