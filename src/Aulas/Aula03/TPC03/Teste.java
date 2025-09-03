package Aulas.Aula03.TPC03;

public class Teste {
        public static void main(String[] args) {
            InterfaceGeral lista = new ListaArray();

            lista.adicionaFim("Arao");
            lista.adicionaFim("Sibinde");
            lista.adicionaFim("Junior");
            lista.adicionaInicio("X: ");

            System.out.println("Tamanho: " + lista.tamanho());
            System.out.println("Elemento na posição 2: " + lista.pega(2));

            lista.removeInicio();
            lista.removeFim();
            lista.removePosicao(0);

            System.out.println("Contém B? " + lista.contem("B")); // true
            System.out.println("Tamanho final: " + lista.tamanho());
        }
    }

