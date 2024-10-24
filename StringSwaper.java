import java.util.*;

public class StringSwaper {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));

    }

    /*
    i make hashMap
    for loop for swaping
    i check if the hashMap contain first character then ,
    after the swap done i need to remove the first character from HashMap
     
     */
    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> charIndex = new HashMap<>();
        boolean[] swapped = new boolean[strings.length];

        for (int i = 0; i < strings.length; i++) {
            char firstCharacter = strings[i].charAt(0);

            if (charIndex.containsKey(firstCharacter)) {
                int swapIndex = charIndex.get(firstCharacter);

                // Only swap if does not swap before
                if (!swapped[swapIndex]) {
                    String temp = strings[i];
                    strings[i] = strings[swapIndex];
                    strings[swapIndex] = temp;
                    swapped[swapIndex] = true;
                }
            } else {
                charIndex.put(firstCharacter, i);
            }
        }
        return strings;
    }
}
