package Aulas.Aula01;

public class Aula01_TPC01{
    public static void main(String[] args) {
        int[] a = {1,4,3,5,8,3,9};
        int[] list = {7,2,5,9};
        System.out.println(" Resolucao alinea A: ");
        insertOne(8,a);
        //System.out.println(" ");
        System.out.println(" Resolucao alinea B: ");
        insertAll(list,a);
        System.out.println(" Resolucao alinea C: ");
        ordenaCrescente(a);
        System.out.println(" Resolucao alinea D: ");
        ordenaDecrescente(a);
        System.out.println(" Resolucao alinea E: ");
        remove(1,a);
        System.out.println();
        System.out.println(" Resolucao alinea F: ");
        removeElement(0,a);
        System.out.println();
        System.out.println(" Resolucao alinea G: ");
        menorElemento(a);
        System.out.println(" Resolucao alinea H: ");
        maiorElemento(a);
    }
    public static int[] insertOne(int element, int[] a){
        // verificar se o array esta cheio ou nao, caso n, add element
        for(int i=0; i<a.length;i++){
            if(a[i] == 0) {
                a[i] = element;
                return a;
            }
        }
        // Criar novo vetor, com uma posicao a mais e relacao ao vetor dado
        int[] novoA = new int [a.length + 1];
        System.out.println(" Vetor antes da adicao: ");
        for(int i:a){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // Copiar todos dados do vetor anterior e colocar no novo vetor
        for(int i=0; i<a.length;i++){
            novoA[i] = a[i];
        }
        // Adicionar o elemento na ultima posicao do vetor
        novoA[novoA.length -1] = element;
        // Imprimir o novo vetor com o novo elemento
        System.out.println("Vetor depois da adicao: ");
        for(int j : novoA){
            System.out.print(j + " ");
        }
        System.out.println(" ");
        return novoA;
    }
    public static int[] insertAll(int[] list, int[]a){
        int [] resultado = a;
        for(int elemento : list){
            resultado = insertOne(elemento,resultado);
        }
        return resultado;
    }
    public static void ordenaCrescente(int[]a){
        for(int i = 0; i<a.length-1;i++){
            for(int j=0; j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void ordenaDecrescente(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j] < a[j+1]){
                    int troca = a[j];
                    a[j] = a[j+1];
                    a[j+1] = troca;
                }
            }
        }
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void remove(int element, int[]a){
        int encontrado=0;
        for(int i=0; i<a.length;i++){
            if(element == a[i]){
                int troca = a[i];
                a[i] = 0;
                encontrado++;
            }
        }
        if(encontrado!=0){
            System.out.println("Valor: " + element + " encontrado e removido do vetor. ");
            for(int i : a){
                System.out.print(i + " ");
            }
        }else{
            System.out.println("Valor: " + element + " nao encontrado no vetor. ");
        }
    }
    public static void removeElement(int index, int[]a){
        int encontrado=0;
        for(int i=0;i<a.length;i++){
            if(index == i){
                encontrado++;
                int troca = a[index];
                a[index] = 0;
            }
        }
        if(encontrado != 0){
            System.out.println("Valor encontrado ");
            System.out.println("Indice: " + index);
            System.out.println("Valor: " + a[index]);
            for(int i : a){
                System.out.print(i + " ");
            }
        }else {
            System.out.println("Indice nao encontrado no array. ");
        }
    }
    public static void menorElemento(int[]a){
        int menor =a[0];
        for(int i=0; i<a.length;i++){
            if(a[i] < menor){
                menor = a[i];
            }
        }
        System.out.println("Menor valor do vetor: "+menor);
    }
    public static void maiorElemento(int[]a){
        int maior =a[0];
        for(int i=0; i<a.length;i++){
            if(a[i] > maior){
                maior = a[i];
            }
        }
        System.out.println("Maior valor do vetor: "+maior);
    }
}