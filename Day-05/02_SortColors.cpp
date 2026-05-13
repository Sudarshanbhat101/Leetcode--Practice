// LeetCode 75. Sort Colors
class Solution {
public:
    void sortColors(vector<int>& nums) {
        for (int i = 0; i < (int) nums.size() - 1; i++) {
            for (int j = i + 1; j < (int) nums.size(); j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
};
