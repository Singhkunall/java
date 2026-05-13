class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size(), m = nums2.size();

        unordered_map<int, int> mp;

        for(int i = 0; i < n; i++){
            mp[nums1[i]]++;
        }

        vector<int> res;

        unordered_map<int, int> mp2;

        for(int i = 0; i < m; i++){
            if(mp.find(nums2[i]) != mp.end()){
                if(mp2.find(nums2[i]) != mp2.end()){
                    continue;
                } else {
                    res.push_back(nums2[i]);
                }
                mp2[nums2[i]]++;
            }
        }

        return res;
    }
};