public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        // Array to be sorted
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array:");
        printArray(array);

        // Calling the insertionSort method and storing the result
        int[] sortedArray = insertionSort(array);

        System.out.println("Sorted Array:");
        printArray(sortedArray);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
