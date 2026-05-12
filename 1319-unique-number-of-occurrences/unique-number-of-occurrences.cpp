class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        sort(arr.begin(), arr.end());
        vector<int> counts;

        
        int count = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                counts.push_back(count);
                count = 1;
            }
        }
        counts.push_back(count);

        
        sort(counts.begin(), counts.end());
        for (int i = 1; i < counts.size(); i++) {
            if (counts[i] == counts[i-1]) {
                return false; 
            }
        }

        return true; 
    }
};