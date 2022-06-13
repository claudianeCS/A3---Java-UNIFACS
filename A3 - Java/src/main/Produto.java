package main;

public class Produto extends Categoria  { //CLASSE FILHA.
    private  String nome;
    private String  quantidade;
    private String peso;
    private String preco;


    public Produto(String nome, String quantidade, String peso, String preco, String nomeCategoria, String setor) {
        super(nomeCategoria, setor);
        this.nome = nome;
        this.quantidade = quantidade;
        this.peso = peso;
        this.preco = preco;

    }
    public void vizualizarDados(){

        System.out.println( nome + "  |  " + quantidade + "  |  " + preco );


    }

    public  void vizualizarDadosCompleto(){

        System.out.println(nome + "  |  " + quantidade + "  |  " + peso + "  |  " + preco + "  |  " + getNomeCategoria() + "  |  " + getSetor());

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


    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }


}
