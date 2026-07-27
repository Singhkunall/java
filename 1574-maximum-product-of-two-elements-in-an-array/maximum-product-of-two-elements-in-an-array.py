class Solution(object):
    def maxProduct(self, nums):
        ans = 0
        n = len(nums)

        for i in range(n):
            for j in range(i + 1, n):
                ans = max(ans, (nums[i] - 1) * (nums[j] - 1))

        return ans