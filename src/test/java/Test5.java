import static Practice.PrimeNumberSeries.checkPrime;

public class Test5 {

    public static void checkPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count==2)
            System.out.println(n+" is Prime");

    }

    public static void main(String[] args) {

        int n=24;
        checkPrime(n);
    }



}
