public class ar_leftRotatebyD{
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n=arr.size();
        
        for(int j=0;j<k;j++){
            int a=arr.get(0);
            for(int i=1;i<n;i++){
                arr.set(i-1,arr.get(i));
                
                
            }
            arr.set(n-1,a);
        }
        return arr;
    }
}