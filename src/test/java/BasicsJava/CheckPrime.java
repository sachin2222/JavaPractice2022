package BasicsJava;

public class CheckPrime {

    public static void checkPrimeNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime");

        }

    }

    public static int printPrimeSeries(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            return n;
        } else
            return -1;

    }



    public static void main(String[] args) {
        int n=100;
        //checkPrimeNumber(n);
        for(int i=1;i<=n;i++){
          int result=  printPrimeSeries(i);
          if(result!=-1)
            System.out.print(result+" ");
        }

    }
}
