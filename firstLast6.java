import java.util.Scanner;

public class firstLast6 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of element in the array: ");
        int size = in.nextInt();

        int[] numbers = new int[size];

        System.out.println("enter the element of the array: ");
        for (int i=0 ;i<size;i++){
            numbers[i]=in.nextInt();
        }
        boolean result = firstLast(numbers);
        System.out.println("Does the array start or end with 6? " + result);

        in.close();
    }
    public static boolean firstLast(int[] numbers){
        return numbers[0] == 6 || numbers[numbers.length - 1] == 6;
    }


}
