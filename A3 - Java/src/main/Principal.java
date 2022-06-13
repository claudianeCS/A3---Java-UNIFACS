package main;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Armazenamento armazenamento = new Armazenamento();

        // interface de introdução
        System.out.println("================ BEM VINDO AO MERCADO!==============");

        System.out.println("================= INFORMAÇÕES======================\n");
        System.out.println(" * Categorias disponiveis: COMIDA, BEBIDA, HIGIENE e VARIEDADES * " + "\n");

        armazenamento.carregarProdutos(); // referencia aos itens pré-cadastrados no sistema.

        for (int i = 0; i <= 11; i++){ // Pode se fazer com o while! Roda o programa 12 vezes.

            mostrarMenu(); //chamada no metodo.


            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha uma opção: ");  //Leitura da opção feita pelo usuario
            int opcao = scanner.nextInt();


            // SAIR
            if(opcao == 7){
                scanner.close();
                break;
            }


            switch (opcao) { // Opções de 1 a 3
                case 1:
                    // CADASTRAR

                    System.out.println("==========================");
                    System.out.println("Cadastra um produto:");
                    System.out.println("Nome: ");
                    String nome = scanner.next();
                    System.out.println("Quantidade: ");
                    String quantidade = scanner.next();
                    System.out.println("Peso: ");
                    String peso = scanner.next();
                    System.out.println("Preço: ");
                    String preco = scanner.next();
                    System.out.println("Categoria :");
                    String categoria = scanner.next();
//----------------------------------------------------------------------------------------
                    //Incremento automatico da variavel SETOR.

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
                        System.out.println("NULL");
                    }
//----------------------------------------------------------------------------------------------

                    System.out.println("==========================\n");

                    Produto produtos = new Produto(nome, quantidade, peso, preco,categoria, setor);
                    armazenamento.receberProdutos(produtos);

                    break;
                case 2:
                    //LISTAR PRODUTOS COM TRES ATRIBUTOS.
                    armazenamento.listarProdutos();
                    break;
                case 3:

                    //LISTAR DE FOMRA ORDENADA POR NOME.
                    System.out.println("LISTA FORMA ORDENADA POR NOME:");
                    armazenamento.listarProdutosOrdenado();
                    break;
                case 4:

                    // BUSCAR
                    System.out.println("===================================");
                    System.out.println("        BUSCAR PRODUTO: ");
                    System.out.println("      !!NOME DO PRODUTO!!");
                    System.out.println("Digite o nome do produto:  ");
                    String resultadoBusca = scanner.next();

                    armazenamento.buscarProdutos(resultadoBusca);
                    break;

                case 5:
                    // MODIFICAR REGISTRO COM O NOME  DO PRODUTO.

                    System.out.println("===================================");
                    System.out.println("       ALTERAR PRODUTO : ");
                    System.out.println("      !!NOME DO PRODUTO!!");
                    System.out.println("Digite o nome do produto:  ");
                    String resultadoAlterar = scanner.next();

                    armazenamento.alterarProduto(resultadoAlterar);

                    break;
                case 6:
                    //REMOVER PRODUTO COM CONFIRMAÇÃO (sim/nâo).

                    System.out.println("===================================");
                    System.out.println("        REMOVER PRODUTO : ");
                    System.out.println("      !!NOME DO PRODUTO!!");
                    System.out.println("Digite o nome do produto:  ");
                    String resultadoRemover = scanner.next();

                    System.out.println("===============================");
                    System.out.println("Deseja realmente remover esse produto?(Sim/Nao) ");
                    String resultadoConfimado = scanner.next();

                    if (resultadoConfimado.equals("Sim")){
                        armazenamento.buscarRemoverProduto(resultadoRemover);
                    } else
                        if (resultadoConfimado.equals("Nao")) {
                            return ;
                    }

                    break;

                default:
                    break;
            }
        }
    }


    //interface do menu
    public static void mostrarMenu(){
        System.out.println("==================================");
        System.out.println("            MENU:     ");
        System.out.println("1 - CADASTRAR PRODUTO");
        System.out.println("2 e 3 - LISTAR / LISTAR DE FORMA ORDENADA");
        System.out.println("4 e 5 - BUSCAR PRODUTO POR NOME/ MODIFICAR REGISTRO");
        System.out.println("6 - REMOVER PRODUTO ");
        System.out.println("7 - SAIR");
        System.out.println("==================================");
    }
}
