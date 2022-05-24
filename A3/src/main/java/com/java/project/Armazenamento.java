package com.java.project;

import java.util.ArrayList;


public class Armazenamento {


    boolean temProduto = false;

    ArrayList<Produto> dados = new ArrayList<>();

    public void receberProdutos(Produto p){
        dados.add(p);
    }
    public void listarProdutos(){

        for (int  i = 0; i < dados.size(); i++){
            dados.get(i).vizualizarDados();
        }
    }

    public void carregarProdutos(){
        dados.add(new Produto("Farinha", "2", "Comida", "8.00"));
        dados.add(new Produto("Sabonete", "1", "Higiene", "2.50"));
        dados.add(new Produto("Vassoura", "1", "Utensilios", "6.80"));
        dados.add(new Produto("Biscoito", "2", "Comida", "2.00"));
        dados.add(new Produto("Chiclete", "4", "Comida", "1.80"));
        dados.add(new Produto("Suco de Uva", "1", "Bebida", "3.00"));
        dados.add(new Produto("Vinho do Porto", "2", "Bebida", "60.00"));

    }

    public void buscarProdutos(String nome){

        for (int  i = 0; i < dados.size(); i++){
            Produto produto = dados.get(i);
            if (produto.getNome().equals(nome)){
                System.out.println("===============================");
                System.out.println("              BUSCA:");
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Preço: "+ produto.getPreco());
                temProduto = true;

            }else {
                temProduto = false;
                System.out.println("Esse produto não foi cadastrado!!!!!!!!");
                return ;
            }
        }
    }




}
