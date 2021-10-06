package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();

    public Imobiliaria() {

    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public Imovel adicionarImovel(Imovel novoImovel) {
        imoveis.add(novoImovel);
        return novoImovel;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Imoveis :");
        dados.append("\n " + imoveis);
        return dados.toString();
    }
}