package Aulas.Aula03.TPC03;
import java.util.ArrayList;
import java.util.List;

public class ListaArray implements InterfaceGeral {
        private List<Object> elementos;

        public ListaArray() {
            this.elementos = new ArrayList<>();
        }

        @Override
        public void adicionaInicio(Object elemento) {
            elementos.add(0, elemento);
        }

        @Override
        public void adicionaPosicao(int posicao, Object elemento) {
            if (posicao < 0 || posicao > elementos.size()) {
                throw new IndexOutOfBoundsException("Posição inválida!");
            }
            elementos.add(posicao, elemento);
        }

        @Override
        public void adicionaFim(Object elemento) {
            elementos.add(elemento);
        }

        @Override
        public Object pega(int posicao) {
            if (posicao < 0 || posicao >= elementos.size()) {
                throw new IndexOutOfBoundsException("Posição inválida!");
            }
            return elementos.get(posicao);
        }

        @Override
        public void removeInicio() {
            if (!elementos.isEmpty()) {
                elementos.remove(0);
            } else {
                throw new IllegalStateException("A lista está vazia!");
            }
        }

        @Override
        public void removePosicao(int posicao) {
            if (posicao < 0 || posicao >= elementos.size()) {
                throw new IndexOutOfBoundsException("Posição inválida!");
            }
            elementos.remove(posicao);
        }

        @Override
        public void removeFim() {
            if (!elementos.isEmpty()) {
                elementos.remove(elementos.size() - 1);
            } else {
                throw new IllegalStateException("A lista está vazia!");
            }
        }

        @Override
        public boolean contem(Object elemento) {
            return elementos.contains(elemento);
        }

        @Override
        public int tamanho() {
            return elementos.size();
        }
    }

