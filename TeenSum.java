public class TeenSum {
    public static void main(String[] main){
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));
        System.out.println(noTeenSum(15, 16, 17));
    }
        
    public static int noTeenSum(int num1 ,int num2 ,int num3){
            return fixTeen(num1)+fixTeen(num2)+fixTeen(num3);
    }
    /*
    15 and 16 count it otherwise count all number between 13 and 19 as 0
     */
    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19) {
            if (n == 15 || n == 16) {
                return n;
            }
            return 0;
        }
        return n;
    }
}
