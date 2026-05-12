class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());

        vector<int> ans;
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i - 1]) {
                count++;
            } else {
                if(count == 2) {
                    ans.push_back(nums[i - 1]);
                }
                count = 1;
            }
        }

        if(count == 2) {
            ans.push_back(nums[n - 1]);
        }

        return ans;
    }
};