import java.util.HashSet;

public class PalindromePermutation {
    public static void main(String[] args){
        String s1 = "taco cat";
        String s2 = "racecar";
        String s3 = "hello";

        System.out.println("Input: \"" + s1 + "\", Output: " + canFormPalindrome(s1));
        System.out.println("Input: \"" + s2 + "\", Output: " + canFormPalindrome(s2));
        System.out.println("Input: \"" + s3 + "\", Output: " + canFormPalindrome(s3));
    }
    /*
    for loop to read all character in array
    if character is letter in the array
    convert characters to lower Case
    if hashset contains the lower character then remove the lower characters
    else add lower character
    return true if size of countChar is less than or equal to 1
    If more than one character is in the HashSet, it indicates that more than one character has an odd frequency

     */
    public static boolean canFormPalindrome(String s) {
        HashSet<Character> countChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerChar = Character.toLowerCase(c);

                if (countChars.contains(lowerChar)) {
                    countChars.remove(lowerChar);
                } else {
                    countChars.add(lowerChar);
                }
            }
        }
        return countChars.size() <= 1;

    }
}
