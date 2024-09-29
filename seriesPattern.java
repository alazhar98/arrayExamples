import java.util.Arrays;

public class seriesPattern {
    public static void main(String[] args){
        System.out.println(Arrays.toString(series(3)));
    }
/*
the length =  n * (n + 1) / 2
i make new array i name it result
index equal to 0
i make nested loop to solve this problem
for loop from i=1 to n
for loop j=1 until j =i
like if i=2 in second iteration then j =2 ==> result[1]=1 index=2
                                              result[2]=2 index=3
in third iteration the loop runs 3 time when j=1,j=2, j=3
                                             result[3]=1 index= 4
                                             result[4]=2 index = 5
                                             result[5]=3 index =6
                                             
 */
    public static int[] series(int n) {
        int l = n * (n + 1) / 2;
        int[] result = new int[l];

        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index] = j;
                index++;
            }
        }
        return result ;
    }
}
