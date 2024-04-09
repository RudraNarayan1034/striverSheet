public class ar_maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maximum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(count > maximum){
                maximum=count;
            }

        }
        return maximum;
        
    }
    
}
