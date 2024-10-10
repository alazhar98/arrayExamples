
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonCharacters {
    public static void main(String[] args) {
        List<Character> input1 = List.of('h', 'e', 'l', 'l', 'o');
        List<Character> input2 = List.of('w', 'o', 'r', 'l', 'd');

        System.out.println("Output: " + findCommonCharacters(input1, input2));
    }

    public static Set<Character> findCommonCharacters(List<Character> str1, List<Character> str2) {
        Set<Character> commonChars = new HashSet<>();
        Set<Character> setStr2 = new HashSet<>(str2); // Convert second list to a set

        for (Character c : str1) {
            // Check if character is in the second set
            if (setStr2.contains(c)) {
                commonChars.add(c); // Add to common characters set
            }
        }

        return commonChars; // Return the set of common characters
    }
}
