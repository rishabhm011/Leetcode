class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product = 0;
        int n = nums.length-1;
            int three = nums[n]*nums[n-1]*nums[n-2];
            int first = nums[n]*nums[0]*nums[1];
            product = Math.max(first,three);
        
        return product;
        
    }
}