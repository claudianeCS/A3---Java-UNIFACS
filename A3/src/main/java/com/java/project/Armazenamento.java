package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class Armazenamento {

    ArrayList<Produto> dados = new ArrayList<>();

    public void receberProdutos(Produto p){
        dados.add(p);
    }

}
