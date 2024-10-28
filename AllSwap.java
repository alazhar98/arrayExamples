import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllSwap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String Spattered by spaces: ");

        String input = scanner.nextLine();
        String[] strings =input.split(" ");

        String[] result = swaps(strings);

        System.out.println(String.join(", ", result));

    }
    public static String[] swaps(String[] strings){
        Map<Character,Integer> firstCharMap  = new HashMap<>();

        for (int i=0;i<strings.length;i++){
            String str = strings[i];
            char firstChar = str.charAt(0);

            if (firstCharMap .containsKey(firstChar)){
                int swapIndex  = firstCharMap .get(firstChar);

                // swap
                String temp = strings[i];
                strings[i] = strings[swapIndex];
                strings[swapIndex] = temp;

                firstCharMap.clear();
            }
            else {
                firstCharMap .put(firstChar,i);
            }
        }
        return strings;
    }
}
