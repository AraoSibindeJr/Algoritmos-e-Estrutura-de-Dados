package Aulas.Aula03.TPC03;

public interface  InterfaceGeral {
    void adicionaInicio(Object elemento);

    void adicionaPosicao(int posicao, Object elemento);

    void adicionaFim(Object elemento);

    Object pega(int posicao);

    void removeInicio();

    void removePosicao(int posicao);

    void removeFim();

    boolean contem(Object elemento);

    int tamanho();
}