package main;

import java.lang.ref.PhantomReference;
import java.util.Comparator;

public class CompararNome implements Comparator<Produto> {  //COMPARAÇÃO DE NOMES PARA A OREDENAÇÃO ATRAVES DO COLLECTIONS.SORT() .

    @Override
    public int compare(Produto p1, Produto p2){
        if (p1 == null || p2 == null){ // VERIFICANDO SE O NOME ESTA EM BRANCO!
            System.out.println("Nome em branco!");

        }
        String nomep1 = p1.getNome(); // COMPARANDO O NOME 1
        String nomep2 = p2.getNome(); // COM O NOME 2

        return nomep1.compareTo(nomep2);
    }
}
