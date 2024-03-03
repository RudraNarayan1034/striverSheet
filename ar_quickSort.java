public class ar_quickSort {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(input, startIndex, endIndex);
            quickSort(input, startIndex, partitionIndex - 1);
            quickSort(input, partitionIndex + 1, endIndex);
        }
    }

    public static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[endIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j < endIndex; j++) {
            if (input[j] <= pivot) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[i + 1];
        input[i + 1] = input[endIndex];
        input[endIndex] = temp;
        return i + 1;
    }

    
}
