package Aulas.Aula02.TPC04;
// Insertion Sort (Ordem Decrescente)
public class Exercicio02 {
    public static void insertionSort(int[]a){
        for(int i = 1; i<a.length;i++){
            int valorCorrente = a[i];
            int j = i -1;
            while(j>=0 && a[j] < valorCorrente){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = valorCorrente;
        }
        for (int i =0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int [] a = {2,4,5,3,1,0,6};
        insertionSort(a);
    }
}
