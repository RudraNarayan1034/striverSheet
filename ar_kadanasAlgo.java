class ar_kadanasAlgo{
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int maxi = nums[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxi=Math.max(sum,maxi);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
        
    }
}