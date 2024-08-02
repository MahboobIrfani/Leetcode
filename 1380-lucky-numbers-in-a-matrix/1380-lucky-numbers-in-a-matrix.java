class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer> ans= new ArrayList<>();
        for(int i=0; i<matrix.length;i++){
            int min=99999999;
            int minindex=0;
            for(int j=0; j< matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minindex=j;
                }
            }
            boolean isTrue=true;
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][minindex]<matrix[j][minindex]){
                    isTrue=false;
                    break;
                }
            }
             if(isTrue){
            ans.add(matrix[i][minindex]);
        }
       }
       
        return ans;
    }
}