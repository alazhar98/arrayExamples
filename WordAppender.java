import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordAppender {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        System.out.println(wordAppend(strings));
    }
    public static String wordAppend(String[] strings){
        Map<String, Integer> count = new HashMap<>();

        String result ="";
        for (String str:strings){
            if(count.containsKey(str)){
                count.put(str,count.get(str)+1);
            }
            else {
                count.put(str,1);

            }
            // check if it is in second or 4th or 6th
            if (count.get(str)%2==0){
                result+=str;
            }

        }
        return result;
    }
}