class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
            int maxi=nums[0];
            int sum=Math.max(0,maxi);
        
        for(int i=1; i< nums.length;i++){
            sum= sum+nums[i];
            maxi= Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}