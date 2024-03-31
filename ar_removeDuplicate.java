public class ar_removeDuplicate
{
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}