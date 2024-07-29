class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
    int[] target= new int[index.length];
        int n=index.length;
        for(int i=0; i<index.length; i++){
            solve(target,nums[i],index[i]);
        }
        return target;
    }
    public static void solve(int[] target, int value, int index){
        for(int j=target.length-1; j>index; j--){
            target[j]=target[j-1];
        }
        target[index]=value;
    }
}