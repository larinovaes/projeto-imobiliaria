package projetoUniversal;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static Scanner dados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private static void menu() {
        System.out.println("****** Sistema *******");
        System.out.println("Digite [1] para cadastrar consumidor");
        System.out.println("Digite [2] para cadastrar uma fatura");
        System.out.println("Digite [3] consultar faturas de um consumidor");
        System.out.println("Digite [4] para sair do programa");
    }

    public static Consumidor cadastrarConsumidor() throws Exception {
        String nome = dados("Digite nome do consumidor:").nextLine();
        String email = dados("Digite o email do consumidor:").nextLine();
        return ServicoConsumidor.cadastrarConsumidor(nome, email);
    }

    public static Fatura cadastrarFatura() throws Exception {
        String email = dados("Digite o email do consumidor: ").nextLine();
        double valor = dados("Digite o valor da fatura: ").nextDouble();
        String dataDeVencimento = dados("Digite a data de vencimento: ").nextLine();

        return ServicoFatura.cadastrarFatura(email, valor, dataDeVencimento);
    }

    public static List<Fatura> pesquisarFatura() throws Exception {
        String email = dados("Digite o email do consumidor: ").nextLine();
        ServicoConsumidor.validarEmail(email);
        List<Fatura> faturas = ServicoFatura.pesquisarFaturaPeloEmailConsumidor(email);
        return faturas;
    }

    public static boolean executar() throws Exception {
        boolean continuar = true;
        while (continuar) {

            menu();
            int opcao = dados("Escolha?").nextInt();

            if (opcao == 1) {
                Consumidor consumidor = cadastrarConsumidor();
                System.out.println(consumidor);
            } else if (opcao == 2) {
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            } else if (opcao == 3) {
                List<Fatura> faturas = pesquisarFatura();
                System.out.println("Quantidade de faturas: " + faturas.size());
                System.out.println(faturas);
            } else if (opcao == 4) {
                System.out.println("Voce saiu do programa");
                continuar = false;
            }
        }
        return continuar;
    }
}
