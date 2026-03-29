class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int n = nums.size();
        int minx = INT_MAX;
        int csum = 0;
        int left = 0;

        for(int i = 0; i < n; i++){
            csum += nums[i];

            while(csum >= target){
                minx = min(minx, i - left + 1);
                csum -= nums[left];
                left++;
            }
        }

        return minx == INT_MAX ? 0 : minx;
    }
};