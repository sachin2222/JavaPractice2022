package Practice;

public class SumOfDigits {

    public static void main(String[] args) {
        int n=567;
        int k=0;

        while(n!=0){
             k=k+n%10;
           n=n/10;

        }

        System.out.println(k);
    }
}
