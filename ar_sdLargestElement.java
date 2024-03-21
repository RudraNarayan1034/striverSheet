public class ar_sdLargestElement{
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int smax=Integer.MIN_VALUE+1;
        for(int i=0;i<n;i++){
            if(a[i]>smax && a[i]!=max){
                smax=a[i];
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        int smin=Integer.MAX_VALUE-1;
        for(int i=0;i<n;i++){
            if(a[i]<smin && a[i]!=min){
                smin=a[i];
            }
        }
        int arr[]=new int[2];
        arr[0]=smax;
        arr[1]=smin;
        return arr;
    }
}