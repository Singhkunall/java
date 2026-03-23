class Solution {
public:
    int maxProductPath(vector<vector<int>>& grid) {
        int m = grid.size(), n = grid[0].size();
        const int MOD = 1e9 + 7;
        
        vector<vector<long long>> maxDP(m, vector<long long>(n, 0));
        vector<vector<long long>> minDP(m, vector<long long>(n, 0));
        
        maxDP[0][0] = minDP[0][0] = grid[0][0];
        
        for (int i = 1; i < m; i++)
            maxDP[i][0] = minDP[i][0] = maxDP[i-1][0] * grid[i][0];
        
        for (int j = 1; j < n; j++)
            maxDP[0][j] = minDP[0][j] = maxDP[0][j-1] * grid[0][j];
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] >= 0) {
                    maxDP[i][j] = max(maxDP[i-1][j], maxDP[i][j-1]) * grid[i][j];
                    minDP[i][j] = min(minDP[i-1][j], minDP[i][j-1]) * grid[i][j];
                } else {
                    maxDP[i][j] = min(minDP[i-1][j], minDP[i][j-1]) * grid[i][j];
                    minDP[i][j] = max(maxDP[i-1][j], maxDP[i][j-1]) * grid[i][j];
                }
            }
        }
        
        if (maxDP[m-1][n-1] < 0) return -1;
        return maxDP[m-1][n-1] % MOD;
    }
};