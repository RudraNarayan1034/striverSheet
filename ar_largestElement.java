class ar_largestElement{
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int result=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>=result)
            {
                result=arr[i];
            }
        }
        return result;
    }
}