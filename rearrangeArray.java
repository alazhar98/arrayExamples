import java.util.Arrays;
import java.util.Scanner;

public class rearrangeArray {
    /*
    i initialize n equal length of numbers and index4 =0
    if i found number 4 i will put number 3 before 4 otherwise put every thing as its

     */
    public static int[] fix34(int[] nums) {
        int n = nums.length;
        int index4 = 0;

        while (index4 < n) {
            if (nums[index4] == 4) {
                int index3 = index4 - 1;

                while (index3 >= 0 && nums[index3] != 3) {
                    index3--;
                }

                if (index3 >= 0 && index3 + 1 < n) {
                    int temp = nums[index4];
                    nums[index4] = nums[index3 + 1];
                    nums[index3 + 1] = temp;
                }
            }
            index4++;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array elements that contains numbers 3 and 4 : ");
        String[] inputArray = scanner.nextLine().split(" ");
        int[] nums = new int[inputArray.length];

        // Convert string input to integer array
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }
        int[] fixedArray = fix34(nums);
        System.out.println("Fixed array: " + Arrays.toString(fixedArray));

        scanner.close();
    }
}