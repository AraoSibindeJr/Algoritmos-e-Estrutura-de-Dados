package Aulas.Aula02.TPC04;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio03 {
    /*Even-Odd Sort
    * 1 => Pares em ordem crescente
    * 2 => Impares em ordem decrescente
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inserir os valores no array
        System.out.println("Insira o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int []v = new int [tamanho];
        int c = tamanho;
        for(int i =0 ; i<v.length;i++){
            System.out.println("Preeencha o vetor com " + c + " espacos: ");
            v[i] = sc.nextInt();
            c--;
        }
        System.out.println("Vetor Original: ");
        System.out.print(Arrays.toString(v));

        // Contar as ocorrencias de impares e pares
        int impares =0, pares=0;
        for(int i =0; i<v.length;i++){
            if(v[i] % 2 == 0){
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println();
        System.out.println(" Pares no vetor =>  " + pares);
        System.out.println(" Impares no vetor =>  " + pares);

        // Criar vetor para Impares e Vetor para Pares
        int [] vPares = new int [pares];
        int [] vImpares = new int [impares];

        // armazenar pares e impares nos seus respectivos vetores
        int iPares = 0, iImpares =0;
        for(int i =0; i<v.length;i++){
            if(v[i] % 2 == 0){
                vPares[iPares++] = v[i];
            }else{
                vImpares[iImpares++] = v[i];
            }
        }
        // Organizar em ordem crescente o vetor de pares
        for(int i =0; i<vPares.length-1; i++){
            for(int j=0; j<vPares.length-1-i; j++){
                if(vPares[j] > vPares[j+1]){
                    int troca =vPares[j];
                    vPares[j] = vPares[j+1];
                    vPares[j+1]= troca;
                }
            }
        }
        System.out.println("Vetor par Crescente: ");
        System.out.println(Arrays.toString(vPares));
        System.out.println();

        // Organizar em ordem decrescente o vetor de impares
        for(int i =0; i<vImpares.length-1; i++){
            for(int j=0; j<vImpares.length-1-i; j++){
                if(vImpares[j] < vImpares[j+1]){
                    int troca =vImpares[j];
                    vImpares[j] = vImpares[j+1];
                    vImpares[j+1]= troca;
                }
            }
        }
        System.out.println("Vetor impar Decrescente: ");
        System.out.println(Arrays.toString(vImpares));
        System.out.println();


        // Saida de dados:
        System.out.println(" Saida de Dados: ");
            for (int vPare : vPares) {
                System.out.print(vPare + " ");
            }
            for (int vIpare : vImpares) {
                System.out.print(vIpare + " ");
            }

    }

}
