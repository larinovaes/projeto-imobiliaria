package projetoUniversal;

public class Fatura {
    private Consumidor consumidor;
    private double valor;
    private String dataDeVencimento;

    public Fatura(Consumidor consumidor, double valor, String dataDeVencimento) {
        this.consumidor = consumidor;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("------- FATURA --------");
        dados.append("\nConsumidor: " + consumidor);
        dados.append("\nValor R$:" + valor);
        dados.append("\nData de vencimento: " + dataDeVencimento);
        return dados.toString();
    }
}
