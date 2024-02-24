public class ar_alternateNumbers {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n = a.length;
        int ans[] = new int[a.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                ans[neg] = a[i];

                neg += 2;
            }
            else {
                ans[pos] = a[i];

                pos += 2;
            }
        }

        return ans;
    }
    
}
