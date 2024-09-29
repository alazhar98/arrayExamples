import java.util.Scanner;

public class BiggerTwo{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the first array: ");
        int size1 = in.nextInt();
        int[] numbers1 = new int[size1];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            numbers1[i] = in.nextInt();
        }


        System.out.println("Enter the number of elements in the second array: ");
        int size2 = in.nextInt();
        int[] numbers2 = new int[size2];

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            numbers2[i] = in.nextInt();
        }


        int[] result = biggerTwo(numbers1, numbers2);
        System.out.println("Array with the larger sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        in.close();
    }

    public static int[] biggerTwo(int[] array1, int[] array2) {
        int sum1 = sumArray(array1);
        int sum2 = sumArray(array2);


        return (sum1 >= sum2) ? array1 : array2;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
