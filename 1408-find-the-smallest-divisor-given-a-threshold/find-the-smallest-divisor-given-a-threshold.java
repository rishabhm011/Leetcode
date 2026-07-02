class Solution {
    static boolean isValid(int[] nums , int threshold , int divisor){
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%divisor==0){
                sum+=nums[i]/divisor;
            }
            else{
                sum+=(nums[i]/divisor)+1; 
            }
           
        }
        if(sum<=threshold){
            return true;
        }
        else{
            return false;
        }

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        int ans = 0;
        int max=0;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int e = max;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValid(nums,threshold,mid)){
                ans = mid;
                e=mid-1;
                

            }
            else{
                
                s = mid+1;
            }
        }
        return ans;
        
        
    }
}