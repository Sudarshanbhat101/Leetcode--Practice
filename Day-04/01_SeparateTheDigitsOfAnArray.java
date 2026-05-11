// LeetCode 2553. Separate the Digits in an Array
import java.util.ArrayList;

class Solution {

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int temp = num;
            int count = 0;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
            int[] arr = new int[count];
            int j = 0;
            while (num > 0) {
                arr[j] = num % 10;
                num = num / 10;
                j++;
            }

            for (int k = count - 1; k >= 0; k--) {
                list.add(arr[k]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
