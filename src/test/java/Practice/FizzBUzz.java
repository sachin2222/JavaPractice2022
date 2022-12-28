package Practice;

public class FizzBUzz {

    public static void main(String[] args) {
        int n=15;
        String s[]=new String[n];

        for(int i=0;i<n;i++){
            int temp=i+1;
            if(temp%3 ==0 || temp%5==0){

                if(temp%3==0){
                    s[i]="Fizz";
                }

                if(temp%5==0){
                    s[i]="Buzz";

                }

                if (temp % 3 == 0 && temp % 5 == 0) {
                    s[i] = "FizzBuzz";

                }
            }

            else
                s[i]=String.valueOf(temp);

        }

        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }

    }
}
