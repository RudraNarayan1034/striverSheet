public class sqrtOfNumber {
    public static int sqrtN(long N) {
        long low = 1;
        long high = N;
        // Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(N)) {
                // eliminate the left half:
                low = (long)(mid + 1);
            } else {
                // eliminate the right half:
                high = (long)(mid - 1);
            }
        }
        // Return low, not high
        return (int)high;
    }
}
