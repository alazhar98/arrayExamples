import java.util.ArrayList;

public class CommonCharacters {
    public static void main(String[] args ){
        ArrayList<Character> input1 = new ArrayList<>();
        input1.add('h');
        input1.add('e');
        input1.add('l');
        input1.add('l');
        input1.add('o');

        ArrayList<Character> input2 = new ArrayList<>();
        input2.add('w');
        input2.add('o');
        input2.add('r');
        input2.add('l');
        input2.add('d');

        System.out.println("Output: " + findCommonCharacters(input1, input2));

    }
    // Loop through the first ArrayList
    // Check if the character is in the second ArrayList and not already in the common list
    // add the character to the list af its common
    public static ArrayList<Character> findCommonCharacters(ArrayList<Character> str1, ArrayList<Character> str2) {
        ArrayList<Character> commonChars = new ArrayList<>();

        for (Character c : str1) {

            if (str2.contains(c) && !commonChars.contains(c)) {
                commonChars.add(c);
            }
        }
        return commonChars;
    }
}
