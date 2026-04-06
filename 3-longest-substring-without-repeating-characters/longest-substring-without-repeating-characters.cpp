class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int ans = 0;
        for(int i = 0; i < s.size(); i++) {
            vector<int> freq(256, 0);
            for(int j = i; j < s.size(); j++) {
                if(freq[s[j]] == 1) {
                    break;
                }
                freq[s[j]]++;
                ans = max(ans, j - i + 1);
            }
        }
        return ans;
    }
};