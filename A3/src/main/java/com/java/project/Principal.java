package com.java.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Armazenamento armazenamento = new Armazenamento();

        System.out.println(" BEM VINDO AO MERCADO!");

        for (int i = 0; i <= 11; i++){ // Pode se fazer com o while!

            mostrarMenu(); //chamada no metodo.

            Scanner scanner = new Scanner(System.in); // variavel dde leitura de dados

            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            //Opção 4  fora do switch:
            if(opcao == 4){
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
                    int quantidade = scanner.nextInt();
                    System.out.println("Catgoria: ");
                    String categoria = scanner.next();
                    System.out.println("Preço: ");
                    double preco = scanner.nextDouble();


                    Produto produtos = new Produto(nome, quantidade, categoria, preco);
                    armazenamento.receberProdutos(produtos);
                    break;
                case 2:
                    //LISTAR - assistir aula do dia 16 de programação




                default:
                    break;
            }
        }
        }

     public static void mostrarMenu(){
        System.out.println("==================================");
        System.out.println("     MENU:     ");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - BUSCAR PRODUTO");
        System.out.println("4 - SAIR");
        System.out.println("==================================");
     }
    }



