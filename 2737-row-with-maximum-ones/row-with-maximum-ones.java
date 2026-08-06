class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0;
        int max = 0;
        int i = 0;
        for(int row = 0; row < mat.length ; row++){
            for(int col = 0 ; col < mat[0].length ; col++){
                if(mat[row][col]==1){
                    count++;
                }
            }
            if(count > max){
                max = count;
                i = row;
            }
            count = 0;
        }
        int[] ans = {i,max};
        return ans;
        
    }
}