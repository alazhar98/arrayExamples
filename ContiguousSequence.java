import java.util.Arrays;

public class ContiguousSequence {
    public static void main(String[] args){
        int[] arr1 = {5, 2, 3, 6, 4, 7};
        System.out.println("Output: " + containsContiguousSequence(arr1));

        int[] arr2 = {10, 14, 10, 12};
        System.out.println("Output: " + containsContiguousSequence(arr2));
    }
    /*
    max will be replaced with min value in the array same as min will replace with the max value
    in the for loop i put the minimum and the maximum number in the array
    i calculate the continuous array length
    if expect length not equal array length then return false

     */
    public static boolean containsContiguousSequence(int[] array) {
        if(array.length==0){
            return false;
        }
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int number:array){
            min = Math.min(min,number);
            max=Math.max(max,number);

        }
        int expectLength = max-min+1;

        if(array.length!=expectLength){
            return false;

        }
        Arrays.sort(array);

        for (int i=1;i<array.length;i++){
            if(array[i]-array[i-1]!=1){
                return false;
            }
        }
        return true;
    }
}
