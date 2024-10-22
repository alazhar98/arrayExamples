
import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the first array:");
        int sizeA = in.nextInt();
        int[] array = new int[sizeA];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < sizeA; i++) {
            array[i] = in.nextInt();
        }

        int[] resultA = getFrontPiece(array);

        System.out.println("Front piece of the array: " + Arrays.toString(resultA));

        in.close();

    }
/*
result = new array with maximum of two index only
import the value for the new array by for loop for only 2 index

 */
    public static int[] getFrontPiece(int[] nums) {

        int[] result = new int[Math.min(nums.length, 2)];

        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i];
        }

        return result;
    }
}
