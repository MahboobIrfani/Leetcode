class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans= new int[n][n];
        int row=ans.length;
        int col=ans[0].length;
        int l=0;
        int r=col-1;
        int t=0;
        int b=row-1;
        int d=0;
        int num=1;
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    ans[t][i]=num;
                    num++;
                }d=1;t++;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    ans[i][r]=num;
                    num++;
                }d=2;r--;
            }else if(d==2){
                for(int i=r;i>=l;i--){
                    ans[b][i]=num;
                    num++;
                }d=3;b--;
            }else if(d==3){
                for(int i=b;i>=t;i--){
                    ans[i][l]=num;
                    num++;
                }d=0;l++;
            }
        }
        return ans;
    }
}