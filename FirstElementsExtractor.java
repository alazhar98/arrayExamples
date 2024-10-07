import java.util.Scanner;
import java.util.Arrays;

public class FirstElementsExtractor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the first array:");
        int sizeA = in.nextInt();
        int[] arrayA = new int[sizeA];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = in.nextInt();
        }
        System.out.println("Enter the number of elements in the Second array:");
        int sizeB = in.nextInt();
        int[] arrayB = new int[sizeB];
        System.out.println("Enter the elements of the Second array:");
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = in.nextInt();
        }
        // Arrays.toString : convert array to human readable
        int[] result = getFirstElements(arrayA, arrayB);
        System.out.println("Resulting array: " + Arrays.toString(result));

        in.close();

    }
/*
first i initialize result as array with only 2 index one from first array and the other from second array
then index =0
i check if the arrays is greater than 0 then will give me the first index from both arrays
i return result and index from both arrays
 */
    public static int[] getFirstElements(int[] arrayA, int[] arrayB){
        int[] result = new int[2];
        int index = 0;

        if (arrayA.length > 0) {
            result[index++] = arrayA[0];
        }
        if (arrayB.length > 0) {
            result[index++] = arrayB[0];
        }
        return Arrays.copyOf(result, index);

    }

}
