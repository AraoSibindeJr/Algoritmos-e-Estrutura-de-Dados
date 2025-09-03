package Avaliacoes.MiniTestes.MiniTeste01;

public class Ex01 {
    public static void cockTail(int []arrNum) {
        boolean shitched = true;
        int start = 0;
        int end = arrNum.length - 1;

        while (shitched) {
            shitched = false;

            for (int i = start; i < end; i++) {
                if (arrNum[i] > arrNum[i + 1]) {
                    int aux = arrNum[i];
                    arrNum[i] = arrNum[i + 1];
                    arrNum[i + 1] = aux;
                    shitched = true;
                }
            }

            if (!shitched)
                break;
            end--;

            shitched = false;

            for (int i = end - 1; i >= start; i--) {
                if (arrNum[i] > arrNum[i + 1]) {
                    int aux = arrNum[i];
                    arrNum[i] = arrNum[i + 1];
                    arrNum[i + 1] = aux;
                    shitched = true;
                }
            }
            start++;
        }
    }
    public static void printarrNumay ( int[] arrNum){
        for (int num : arrNum) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main (String[]args){
        int[] arrNum = {5, 1, 4, 2, 8, 0, 2};
        System.out.println("Array original:");
        printarrNumay(arrNum);
        cockTail(arrNum);
        System.out.println("Array ordenado:");
        printarrNumay(arrNum);
    }
}

