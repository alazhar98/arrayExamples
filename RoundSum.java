public class RoundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));
        System.out.println(roundSum(12, 13, 14));
        System.out.println(roundSum(6, 4, 4));
    }

    public static int roundSum(int num1, int num2, int num3) {
        return round10(num1) + round10(num2) + round10(num3);
    }
    /*
    remainder = number %10
    if the number is less than 5 , so example if number is 16 the remainder will be 6 so 6 is greater than 5
    then 16+(10-6)=20
     */
    public static int round10(int number){

        int remainder = number%10;

        if (remainder<5 ){
            return number-remainder;
        }
        else {
            return number+(10-remainder);
        }
    }
}
