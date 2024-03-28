public class ar_linearSearch{
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1; // if num is not found in the array
    }

    public static void main(String[] args) {
        // Sample Input
        int n = 5;
        int num = 4;
        int[] arr = {6, 7, 8, 4, 1};

        int result = linearSearch(n, num, arr);
        // You can use the result as per your requirements
    }
}