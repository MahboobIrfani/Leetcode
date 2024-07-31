class Solution {
    public int findNumbers(int[] nums) {
        int num=0;
        int n= nums.length;
        for(int i=0; i<n;i++){
            int count=0;
           while(nums[i]>0){
               int r= nums[i]%10;
               nums[i]=nums[i]/10;
               count++;
           }
            if(count%2==0){
                num++;
            }
        }
        return num;
    }
}