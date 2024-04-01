public class hashing_countFrequency{
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        int arr[]=new int[n];
        for(int i=1;i<=n;i++){
            if(mp.containsKey(i)){
                 arr[i-1]=mp.get(i);
            }
            else{
                arr[i-1]=0;
            }
            
        }
        return arr;
    }

}