import java.util.Arrays;
import java.util.Scanner;

public class swapEnds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int length = in.nextInt();


        int[] nums = new int[length];

        System.out.println("Enter " + length + " integers:");
        for (int i = 0; i < length; i++) {
            nums[i] = in.nextInt();
        }


        int[] result = swap(nums);
        System.out.println("Array after swapping ends: " + Arrays.toString(result));

        in.close();
    }
    /*
    let first will get first index in array
    then the first index in array equal the last index
    to swap
     */
    public static int[] swap(int[] nums) {

        int first = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = first;

        return nums;
    }
}
