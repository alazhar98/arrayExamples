import java.util.Scanner;

public class LargestBlock {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        int maxBlockLength = findingMaxBlock(input);
        System.out.println("The length of the largest block is: " + maxBlockLength);

        in.close();
    }
    /*
    i initialize maxLength and currentLength=1
    i go through the string and if i found character that same as character before i increment current length
    else i find the max between maxLength and current length

     */
    public static int findingMaxBlock(String str){
        int maxLength=1;
        int currentLength=1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;

            }
            else {
                maxLength=Math.max(maxLength,currentLength);
                currentLength=1;
            }


        }
        maxLength=Math.max(maxLength,currentLength);
        return maxLength;
        }
}

