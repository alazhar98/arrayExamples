import java.util.Scanner;

public class CountClumps {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int clumpCount = clumps(arr);
        System.out.println("Number of clumps: " + clumpCount);

        in.close();
    }
    /*
    i initialize count and i to 0
    while i < the array length increase i by 1
    check if i less than the last element in the array and element in the array equal the next element
    then increase count by 1
    while i less than the last element in the array and element in the array equal the next element increase i by 1
    that is count how many clumps in the array
     */
    public static int clumps(int[] arr){
        int count = 0;
        int i = 0;

        while (i<arr.length){
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;

                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
            i++;
        }

        return count;
    }
}


