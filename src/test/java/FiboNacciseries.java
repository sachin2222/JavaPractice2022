public class FiboNacciseries {
    private static int printFibo(int n) {
        if (n == 0)
            return 0;

        if(n==1)
            return 1;

        else
            return printFibo(n-1)+printFibo(n-2);
    }

    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++){
            System.out.print(printFibo(i)+" ");
        }

    }


}
