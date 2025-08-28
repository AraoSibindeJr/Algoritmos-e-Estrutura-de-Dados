package Aulas.Aula02.TPC04;
import java.util.Scanner;
public class Exercicio01 {

    //Implementacao do BubbleSort => Ordem Crescente
    public static void bubbleSort(int []a){
        for(int i = 0; i<a.length-1;i++){
            for (int j = 0; j < a.length -1-i; j++) {
                if(a[j]>a[j+1]){
                    int troca = a[j+1];
                    a[j+1] = a[j];
                    a[j] = troca;
                }
            }
        }
        System.out.println();
        System.out.println("Array Ordenado:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor: ");
        byte tamanho = sc.nextByte();
        int [] a = new int[tamanho];
        byte cont = tamanho;
        for (int i =0; i<a.length;i++){
            System.out.println("Preencha o array com " + cont +  " espacos:");
            a[i] = sc.nextInt();
            cont--;
        }
        System.out.println("Array nao ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        bubbleSort(a);
    }
}



