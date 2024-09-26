import java.util.Scanner;

public class maxTriple {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of element in the array: ");
        int size = in.nextInt();

        int[] numbers = new int[size];

        System.out.println("enter the element of the array: ");
        for (int i=0 ;i<size;i++){
            numbers[i]=in.nextInt();
        }
        int result = maxT(numbers);
        System.out.println("The largest value among the first, last, and middle elements: " + result);

        in.close();

    }
    /*
    first i initialize integer arrays name it numbers
    i name the first index with first
    last index i get it by numbers.length-1
    the middle index i get it by divide the length by two
    so if array has 3 element will be 2/2 will be 1 so the middle is the index 1
    then i use math to get the max numbers between first and last and middle numbers

     */
    public static int maxT(int[] numbers){
        int first = numbers[0];
        int last = numbers[numbers.length-1];
        int mid = numbers[numbers.length/2];

        return Math.max(first,Math.max(last,mid));
    }
}
