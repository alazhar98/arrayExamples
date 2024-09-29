import java.util.Scanner;

public class CommonEnd {
    public static void main(String[] args ){
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
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = in.nextInt();
        }

        boolean result = arraysEnd(arrayA, arrayB);
        System.out.println("Do the arrays have the same first or last element? " + result);

        in.close();

    }

    /*
    if the two arrays that user enter them are tha same first element or last element
    will return true
     */
    public static boolean arraysEnd(int[] arrayA,int[] arrayB){

        return (arrayA[0] == arrayB[0]) || (arrayA[arrayA.length - 1] == arrayB[arrayB.length - 1]);
    }
}
