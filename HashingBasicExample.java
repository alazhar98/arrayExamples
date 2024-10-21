public class HashingBasicExample {
    public static void main(String[] args) {
        String str = "alazhar";
        Integer num = 0;
        int prime = 31;
        for (int i = 0; i < str.length(); i++) {
            num += Integer.valueOf(str.charAt(i)) * prime;
            prime = prime + 2;

        }
        System.out.println(num);
    }
}