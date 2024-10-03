public class ChocolateMaker {
    public static void main(String[] args) {
        System.out.println(makeChocolate(1, 4, 9));
        System.out.println(makeChocolate(1, 4, 10));
        System.out.println(makeChocolate(1, 4, 7));
    }
    /*
    find the minimum between big and the goal/5 after that i multiply the number i get by 5
    to find the remaining weight i need to subtract goal by big weight
    if i found remaining is less than small i return -1

     */
    public static int makeChocolate(int big, int small, int goal) {

        int maxBigWeight = Math.min(big , goal/5);

        int bigWeight = maxBigWeight*5;

        int remainingWeight = goal - bigWeight;

        if (remainingWeight > small) {
            return -1;
        }

        return remainingWeight;
    }
}
