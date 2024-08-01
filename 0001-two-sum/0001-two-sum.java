class Solution {
    public int[] twoSum(int[] nums, int target) {
     /* int n= nums.length;
         int[] ans= new int[2];
        for(int i=0; i<n;i++){
            for(int j=0;j<n; j++){
                if(nums[i]+nums[j]==target && i!=j){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;*/
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length;i++){
            int complement= target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[]{i,map.get(complement)};
        }
    }
        return new int[]{-1,-1};
 }
}
