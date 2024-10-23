import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // two HashMap one for vowel and the other for consonant
        Map<Character, Integer> vowel = new HashMap<>();
        Map<Character, Integer> consonant = new HashMap<>();


        String vowels = "aeiou";

        // for loop for every character in the input
        for (char c : input.toCharArray()) {

            // check if character is alphabet not spaces or another things
            if (Character.isAlphabetic(c)) {
                char lowerChar = Character.toLowerCase(c);

                if (vowels.indexOf(lowerChar) != -1) {

                    // count the number of vowel and how many it appear
                    vowel.put(lowerChar, vowel.getOrDefault(lowerChar, 0) + 1);
                } else {
                    // count the number of consonant and how many it appear
                    consonant.put(lowerChar, consonant.getOrDefault(lowerChar, 0) + 1);
                }
            }
        }

        System.out.println("Vowels:");
        for (Map.Entry<Character, Integer> entry : vowel.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("\nConsonants:");
        for (Map.Entry<Character, Integer> entry : consonant.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
