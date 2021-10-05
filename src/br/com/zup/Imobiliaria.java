package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public  class Imobiliaria {
    private List<Imoveis> imovel = new ArrayList<>();

    public Imobiliaria() {

    }

    public Imoveis adicionarImovel(Imoveis novoImovel) {
        imovel.add(novoImovel);
        return novoImovel;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Imoveis :");
        dados.append("\n " + imovel);
        return dados.toString();
    }
}