//LeetCode 303, resolved by DP
class RangeSumQuery {
private int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length];
        dp[0] = nums[0];//base case;
        
        //pre record sum
        for(int i =1; i< dp.length; i++){
            dp[i] = dp [i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int result = 0;
        if (left <= 0) result = dp[right];
        else result = dp[right] - dp[left-1];
        
        return result;
    }
}
