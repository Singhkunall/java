class Solution {
public:
    int smallestNumber(int n, int t) {
        while (true) {
            int num = n;
            int product = 1;

            while (num > 0) {
                int digit = num % 10;

                if (digit == 0) {
                    product = 0;
                    break;
                }

                product *= digit;
                num /= 10;
            }

            if (product % t == 0)
                return n;

            n++;
        }
    }
};