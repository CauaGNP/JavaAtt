import java.util.Random;

public class att5 {
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
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


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
