class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        long long sum = 0;
        for (int value : nums) {
            sum += value;
        }
        return static_cast<int>(sum % k);
    }
};
