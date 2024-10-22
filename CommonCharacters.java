import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {
    public static void main(String[] args) {
        Set<Character> input1 = Set.of('h', 'e', 'l', 'l', 'o');
        Set<Character> input2 = Set.of('w', 'o', 'r', 'l', 'd');

        System.out.println("Output: " + findCommonCharacters(input1, input2));
    }

    public static Set<Character> findCommonCharacters(Set<Character> str1, Set<Character> str2) {
        Set<Character> commonChars = new HashSet<>(str1); // Initialize with first set
        commonChars.retainAll(str2); // Retain only common characters

        return commonChars; // Return the set of common characters
    }
}
