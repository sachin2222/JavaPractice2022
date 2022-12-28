public class ArmstrongNumber {

    public static void main(String[] args) {
        int n =987;
        int N=n;
        int rev = 0;
        int sum=0;

        int count=0;

        //count digits
        while(N!=0){
          count++;
          N=N/10;
        }
        int temp= (int) Math.pow(10,count-1);
        //reverse Digits
        while (n != 0) {
            int r = n % 10;
           // rev+=r*temp;
            sum+=r;

            n = n / 10;
            //temp=temp/10;

        }
        System.out.println(sum);



        //sum of Digit

    }
}
