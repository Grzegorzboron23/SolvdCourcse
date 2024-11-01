public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        // Array to be sorted
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array:");
        printArray(array);

        // Calling the bubbleSort method and storing the result
        int[] sortedArray = bubbleSort(array);

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
