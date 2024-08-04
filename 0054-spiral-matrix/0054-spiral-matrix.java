class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
/*  l   r
 t [1 2 3]
  [4 5 6]
 b [7 8 9]/*/
        List<Integer> ans= new ArrayList<>();
        int row= matrix.length;
        int col=matrix[0].length;
        int l=0;
        int r= col-1;
        int t=0;
        int b=row-1;
        int d=0;
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    ans.add(matrix[t][i]);
                }d=1;t++;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    ans.add(matrix[i][r]);
                }d=2;r--;
            }else if(d==2){
                for(int i=r;i>=l;i--){
                    ans.add(matrix[b][i]);
                }d=3;b--;
            }else if(d==3){
                for(int i=b; i>=t; i--){
                    ans.add(matrix[i][l]);
                }d=0;l++;
            }
        }
        return ans;
    }
}
