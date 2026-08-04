class Solution {
    public int first(int[] nums, int target){
        int start=0;
        int end = nums.length-1;
        int ans = -1;
        
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;

        
    }
    

    public int last(int[] nums, int target){
        int start=0;
        int end = nums.length-1;
        int ans1 = -1;
        
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]==target){
                ans1 = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans1;

        
    }
    

    public int[] searchRange(int[] nums, int target) {
        int f = first(nums,target);
        int l = last(nums,target);
        int arr[] = {f , l};
        return arr;

        
}
}