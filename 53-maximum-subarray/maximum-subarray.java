class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int maxe = nums[0];
        for( int i = 1 ; i < nums.length ; i++ )
        {
            maxe = Math.max(nums[i],maxe+nums[i]);
            result = Math.max(maxe,result);
        }
        return result;
    }
}