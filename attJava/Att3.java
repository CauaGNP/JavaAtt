package attJava;
public class Att3 {
        public static void selectionSort(int[] arr){
        int lengthArr = arr.length;

        for(int i = 0; i < lengthArr - 1 ; i++){
            int menorValor = i;
            for(int j = menorValor + 1; j < lengthArr; j++){
                if(arr[j] > arr[menorValor]){
                    menorValor = j;
                }
            }
            if(menorValor != i ){
                int t = arr[i];
                arr[i] = arr[menorValor];
                arr[menorValor] = t;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        selectionSort(array);
        System.out.println(" ");
        System.out.println("Array ordenado de forma decrescente:");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("A mudança ocorreu apenas na condição do segundo for.");
        System.out.println("Antes: if(arr[j] < arr[menorValor])");
        System.out.println("Depos: if(arr[j] > arr[menorValor])");
    }   
}
