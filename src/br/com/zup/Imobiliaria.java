package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public  class Imobiliaria {
    private List<Imoveis> imovel = new ArrayList<>();
    private FuncionarioResponsavel funcionarioResponsavel;

    public Imobiliaria() {

    }
    public Imoveis adicionarImovel( Imoveis novoImovel){
        imovel.add(novoImovel);
        return novoImovel;
    }
}
