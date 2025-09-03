package Aulas.Aula03.Teorica;

import java.util.ArrayList;

public class AulaTeorica {
    /*Nesta aula, aprendemos sobre Array List, em seguinda, alguns exemplos de uso*/

    public static void main(String[] args) {
        //Criar um arrayList:
        ArrayList<String> lista = new ArrayList<>();

        //adicionar elemento:
        lista.add("Cao");
        lista.add("Gato");

        //adicionar elemento numa dada posicao
        lista.add(2,"Coelho");
        lista.add(3,"Cobra");

        //Verificar se um elemento esta na lista(A resposta sera TRUE or FALSE):
        System.out.println("Ovelha esta na lista? : " + lista.contains("Ovelha"));
        System.out.println(lista);

        // O ArrayList tem muitos outros metodos que podem ser usados em diversos casos!

    }
}
