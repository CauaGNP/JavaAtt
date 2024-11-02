import java.util.Random;

public class Att5 {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        System.out.println("Resposta 1°:");
        System.out.println(" ");

        System.out.println(" Selection Sort");
        System.out.println("Caso Médio e Pior: O(n^2) - pois, em ambos os casos, o algoritmo percorre todo o array para encontrar o menor elemento");
        System.out.println("e o coloca na posição correta, repetindo esse processo para cada posição");
        System.out.println(" ");

        System.out.println("Insertion Sort");
        System.out.println("Caso Médio e Pior: O(n^2) - o algoritmo precisa inserir cada elemento na posição correta, comparando");
        System.out.println(" com os elementos anteriores. No melhor caso (array já ordenado), a complexidade é O(n).");
        System.out.println(" ");

        System.out.println("Resposta 2°(Vantagem dos algoritimos):");
        System.out.println(" Insertion Sort é mais vantajoso para arrays parcialmente ordenados ou pequenos. Ele ajusta rapidamente os elementos para a posição correta com menos trocas e comparações.");
        System.out.println("  Selection Sort é preferido quando o número de trocas precisa ser minimizado, pois o algoritmo faz apenas n - 1 trocas, independentemente da ordenação inicial dos elementos.");
        System.out.println(" ");

        int[] sizes = {100};
        Random rand = new Random();

        for (int size : sizes) {
            int[] array1 = new int[size];
            int[] array2 = new int[size];

            for (int i = 0; i < size; i++) {
                int value = rand.nextInt(10000);
                array1[i] = value;
                array2[i] = value;
            }

            long startTime = System.nanoTime();
            selectionSort(array1);
            long endTime = System.nanoTime();
            long selectionSortTime = endTime - startTime;

            startTime = System.nanoTime();
            insertionSort(array2);
            endTime = System.nanoTime();
            long insertionSortTime = endTime - startTime;

            System.out.println("Tamanho: " + size);
            System.out.println("Selection Sort: " + selectionSortTime + " ns");
            System.out.println("Insertion Sort: " + insertionSortTime + " ns");
            System.out.println();
        }
    }

}
