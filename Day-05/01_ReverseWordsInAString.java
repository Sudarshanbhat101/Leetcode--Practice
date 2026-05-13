// LeetCode 151. Reverse Words in a String
class Solution {

    public String reverseWords(String s) {

        // Remove extra spaces from start/end
        s = s.trim();

        // Split words by one or more spaces
        String[] words = s.split("\\s+");

        int left = 0;
        int right = words.length - 1;

        // Reverse words array
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        // Join words with single space
        return String.join(" ", words);
    }
}
