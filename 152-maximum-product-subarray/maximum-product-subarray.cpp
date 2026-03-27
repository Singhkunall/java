class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxp = nums[0];
        int minp = nums[0];
        int globalmax = nums[0];

        int n = nums.size();
        int currentProduct = 1;
        for(int i = 1; i<n; i++){
            if(nums[i]<1){
                swap(maxp,minp);
            }
            maxp = max(nums[i], maxp*nums[i]);
            minp = min(nums[i], minp*nums[i]);

            globalmax = max(globalmax, maxp);
        }
        return globalmax;
        
    }
};