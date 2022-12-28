package Practice;

public class countDigits {
    public static void main(String[] args) {
        int n = 1235;
        int count = 0;
        int mul = 1;

        while (n != 0) {

            count++;
            n = n / 10;
        }
        System.out.println(count);
        int i = 1;

        while (i <= count) {
            mul = 10 * mul;
            i++;
        }

        System.out.println(mul);

    }
}
