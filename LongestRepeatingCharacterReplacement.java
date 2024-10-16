import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int result = characterReplacement(s, k);
        System.out.println("Output: " + result);

    }
/*
(count)Array to count frequency of each character
i initialize maxFrequency to find Maximum frequency of a single character
count[currentChar - 'A']++ to increment frequency of the current character
If the number of changes  k then read from the left
Decrement frequency of the leftmost character
Move the left pointer to the right
Calculate the maximum length of the current
return max Length

 */
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxLength = 0;
        int maxFrequency = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++;
            maxFrequency = Math.max(maxFrequency, count[currentChar - 'A']);

            while (right - left + 1 - maxFrequency > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
