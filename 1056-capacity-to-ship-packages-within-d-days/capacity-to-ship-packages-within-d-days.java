class Solution {
    static boolean isValid(int[] weights, int days, int capacity){
        int day = 1;
        int cap=0;
        for(int i=0;i<weights.length;i++){
            if(cap+weights[i]<=capacity){
            cap+=weights[i];
            
            }
            else{
                day++;
                cap=weights[i];

            }
        }
        if(day<=days){
            return true;
        }
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        
        int max=0;
        int ans=0;
        int sum =0;
        for(int i=0;i<weights.length;i++){
            {
                if(max<weights[i]){
                    max=weights[i];
                }
                sum+=weights[i];
            }
        }
        
        int s=max;
        int e = sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(weights,days,mid)){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}