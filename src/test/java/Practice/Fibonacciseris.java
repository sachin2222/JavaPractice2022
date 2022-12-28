package Practice;

public class Fibonacciseris {

    static  int n1=0,n2=0,n3=0;

    public static int fibonacciseries(int n) {

        if(n==0)
            return 0;

        if(n==1 ||n==2)
            return 1;

        else
            return fibonacciseries(n-1 ) +fibonacciseries(n-2);

    }



    public static void main(String[] args) {
        int n=10;

        for(int i=0;i<=n;i++){

            System.out.print(fibonacciseries(i)+ " ");
        }



    }
}
