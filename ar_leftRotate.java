public class ar_leftRotate{
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int a =arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];

        }
        arr[n-1]=a;
        return arr;

    }
}