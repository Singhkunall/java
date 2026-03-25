class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int maxSum = nums[0];
        int csum = nums[0];

        for(int i = 1; i < n; i++){
            if(csum < 0){
                csum = nums[i];
            } else {
                csum = csum + nums[i];
            }
            maxSum = max(maxSum, csum);
        }
        return maxSum;
    }
};