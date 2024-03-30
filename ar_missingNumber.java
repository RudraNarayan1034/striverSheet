public class ar_missingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            
            sum +=nums[i];
        }
        int missing =s-sum;
        return missing;
        
    }
    
}
