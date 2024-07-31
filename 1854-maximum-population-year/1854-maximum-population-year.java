class Solution {
    public int maximumPopulation(int[][] logs) {
    int[] arr= new int[101];
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0]; j<logs[i][1];j++){
                arr[j-1950]++;
            }
        }
        int max=0;
        int year=0;
        for(int i=0;i<101;i++){
            if(max<arr[i]){
                max=arr[i];
                year=i+1950;
            }
        }
        return year;
    }
}