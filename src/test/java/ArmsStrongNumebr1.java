public class ArmsStrongNumebr1 {
    public static void main(String[] args) {
        int n=372;
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum= (int) (sum+Math.pow(r,3));
            n=n/10;
        }

        System.out.println(sum);


    }
}
