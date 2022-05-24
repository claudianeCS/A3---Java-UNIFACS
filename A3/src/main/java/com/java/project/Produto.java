package com.java.project;

public class Produto {
    private  String nome;
    private String  quantidade;
    private String categoria;
    private String preco;


    public Produto(String nome, String quantidade, String categoria, String preco) {

        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.preco = preco;

    }
    public void vizualizarDados(){

        System.out.println("=====================================");
        System.out.println(                "LISTAR:");
        System.out.println("  Nome   -  Quantidade  _  Preço ");
        System.out.println( nome + "  |  " + quantidade + "  |  " + preco );

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
