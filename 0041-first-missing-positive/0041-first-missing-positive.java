class Solution {
    public int firstMissingPositive(int[] nums) {
      /*  int n=nums.length;
        //1-[3,4,-1,1]
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=n+1;
            }
        }
        //2-[3,4,5,1]
        for(int i=0;i<n;i++){
            int id=Math.abs(nums[i]);
            if(id>n) continue;
            id--;
            if(nums[id]>0) nums[id]=-nums[id];
        }//3-[-3,4,-5,-1]
        for(int i=0;i<n;i++){
            if(nums[i]>0)
            return i+1;
        }
        return n+1;
    }*/
    int i=0;
    while(i<nums.length){
        int correct=nums[i]-1;
        if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }else{
            i++;
        }
    }
    for(int index=0; index<nums.length; index++){
        if(nums[index]!=index+1){
            return index+1;
        }
    }
    return nums.length+1;
    }
    public static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}