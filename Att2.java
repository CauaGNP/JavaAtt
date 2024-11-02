public class Att2 {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    } 
    public static void main(String[] args){
        int[] array = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        System.out.println("Array antes da ordenação");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        insertionSort(array);

        System.out.println("Array depois da ordenação");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
