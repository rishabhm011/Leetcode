class Solution {
    public int maxSubArray(int[] nums) {
        //step 1 sum 
        //step 2 maxi
        //step 3 sum check -ve
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            maxi = Math.max(maxi,sum);
            if(sum<0){
            sum=0;
        }
            
        }
        
        return maxi;
    }
}