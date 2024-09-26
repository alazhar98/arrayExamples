import java.util.Scanner;
import java.util.Arrays;

public class BiggerTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 2 elements for the first array: ");
        int[] firstArray = new int[2];
        firstArray[0]= in.nextInt();
        firstArray[1]= in.nextInt();
        System.out.print("Enter 2 elements for the Second array: ");
        int[] secondArray = new int[2];
        secondArray[0]= in.nextInt();
        secondArray[1]= in.nextInt();

        int[] result = bigger(firstArray, secondArray);
        System.out.println("Array with the larger sum: " + Arrays.toString(result));

        in.close();
    }
    public static int[] bigger(int[]firstArray,int[]secondArray){
        int sumA = firstArray[0]+firstArray[1];
        int sumB = secondArray[0]+secondArray[1];

        if (sumA>=sumB){
            return firstArray;
        }
        else {
            return secondArray;
        }
    }
}
