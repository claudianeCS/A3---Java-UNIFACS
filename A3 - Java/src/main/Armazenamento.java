package main;

import java.util.*;

public class Armazenamento {

    List<Produto> produtos = new ArrayList<>();

    public void receberProdutos(Produto p) { //RECEBER PRODUTOS CADASTRADOS.
        produtos.add(p);

    }

    public void listarProdutos() { //LISTAR DE FORMA TABULAR COM TRES ATRIBUTOS.

        System.out.println("=====================================");
        System.out.println(                "LISTAR  :");
        System.out.println("  Nome   -  Quantidade  _  Preço ");


        for (int a = 0; a < produtos.size(); a++){
            produtos.get(a).vizualizarDados();
        }
    }

    public void listarProdutosOrdenado(){ //LISTAR PRODUTOS ORDENADOS EM ORDEM ALFABETICA POR NOMES.
        CompararNome cpn = new CompararNome();

        Collections.sort(produtos, cpn);

        System.out.println("=====================================");
        System.out.println(                "LISTAR POR NOME:");
        System.out.println("  Nome   -  Quantidade  _  Peso  -  Preço  - Categoria  -  Setor ");


        for (int a = 0; a < produtos.size(); a++){
            produtos.get(a).vizualizarDadosCompleto();
        }
    }


    public void carregarProdutos() { //CAARREGAMENTO DOS 7 PRODUTOS

        produtos.add(new Produto("Farinha", "2", "5Kg", "8.00", "COMIDA", "A1"));
        produtos.add(new Produto("Sabonete", "1", "250g", "2.50", "HIGIENE", "C3"));
        produtos.add(new Produto("Vassoura", "1", "null", "6.80","VARIEDADES", "D4"));
        produtos.add(new Produto("Biscoito", "2", "130g", "2.00", "COMIDA","A1"));
        produtos.add(new Produto("Chiclete", "4", "2g", "1.80","COMIDA","A1"));
        produtos.add(new Produto("Suco de Uva", "1", "1L", "3.00", "BEBIDA","B2"));
        produtos.add(new Produto("Vinho do Porto", "2", "750ml", "60.00","BEBIDA","B2"));

    }

    public void buscarProdutos(String nome) { //METODO BUSCAR PRODUTOS CADASTRADOS.
        boolean achou = false;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            //LISTAR DE FORMA ORDENADA
            if (produto.getNome().equals(nome)) {
                System.out.println("===============================");
                System.out.println("              BUSCA POR NOME :");
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Peso: " + produto.getPeso());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Categoria: " + produto.getNomeCategoria());
                System.out.println("Setor: "  + produto.getSetor());
                achou = true;

            }

        }
        if (!achou){
            System.out.println("Produto não Encontrado"); /// caso não o produto não seja encontrado.
        }

    }

    public void alterarProduto(String nome) { //BUSCAR E ALTERAR PRODUTO

        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);

            if (produto.getNome().equals(nome)) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("===================================");
                System.out.println("       PRODUTO ALTERADO : ");
                System.out.println("Nome: ");
                String nome2 = scanner.next();
                System.out.println("Quantidade: ");
                String quantidade = scanner.next();
                System.out.println("Peso: ");
                String peso = scanner.next();
                System.out.println("Preço: ");
                String preco = scanner.next();
                System.out.println("Categoria :");
                String categoria = scanner.next();

                String setor = "";

                if (categoria != null){
                    if (categoria.equals("COMIDA")){
                        setor = "A1";
                    }
                    if (categoria.equals("BEBIDA")) {
                        setor = "B2";
                    }
                    if (categoria.equals("HIGIENE")) {
                        setor = "C3";
                    }
                    if (categoria.equals("VARIEDADES")) {
                        setor = "D4";
                    }
                } else {
                    System.out.println("Digite uma categoria!");
                }

                produto.setNome(nome2);
                produto.setQuantidade(quantidade);
                produto.setPeso(peso);
                produto.setPreco(preco);
                produto.setSetor(setor);

            }

        }

    }

    public void buscarRemoverProduto(String resultado){ //BUSCAR E REMOVER PRODUTO CADASTRADO.

        for (int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
            if (produto.getNome().equals(resultado)){
                produtos.remove(produto);
            }
        }

    }



}
