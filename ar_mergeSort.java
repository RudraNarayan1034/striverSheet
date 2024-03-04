import java.util.ArrayList;

public class ar_mergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid); // Sort the left half
            mergeSort(arr, mid + 1, r); // Sort the right half
            merge(arr, l, mid, r); // Merge the sorted halves
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            
            left++;
        }

        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
}
