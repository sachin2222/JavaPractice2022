package Practice;

public class DigutsReverse {

    public static void main(String[] args) {
        int n = 870;
        int result = 0;
        int m = 100;

        while (n != 0) {
            int k = n % 10;

            result = result + k * m;
            m = m / 10;

            n = n / 10;
        }

        System.out.println(result);
    }
}
