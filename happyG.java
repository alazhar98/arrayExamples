import java.util.Scanner;

public class happyG {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        boolean result = gHappy(input);
        System.out.println("Are all 'g's happy? " + result);

        in.close();
    }
    /*
    for loop that go through the string
    check if character is g then left or Right of g is equal to g
    if not left of g or right of g not equal both to g the return false
    otherwise return true
     */
    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftHappy = (i > 0 && str.charAt(i - 1) == 'g');
                boolean rightHappy = (i < str.length() - 1 && str.charAt(i + 1) == 'g');

                if (!leftHappy && !rightHappy) {
                    return false;
                }
            }
        }
        return true;
    }

}
