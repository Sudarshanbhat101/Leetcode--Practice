// LeetCode 7. Reverse Integer
class Solution {
public:
    int reverse(int x) {
        long long reversedNumber = 0;

        while (x != 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;

            if (reversedNumber > INT_MAX || reversedNumber < INT_MIN) {
                return 0;
            }

            x /= 10;
        }

        return static_cast<int>(reversedNumber);
    }
};
