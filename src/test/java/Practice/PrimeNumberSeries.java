package Practice;

import java.util.Scanner;

public class PrimeNumberSeries {

    public static int checkPrime(int n){
        int count=0;

       for(int i=1;i<=n;i++){
           if(n%i==0){
               count++;
           }

       }

       if(count==2)
           return n;

       else
           return -1;
    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //int n=scanner.nextInt();
        int n=100;
        for(int i=2;i<=n;i++){
           int result= checkPrime(i);
           if(result!=-1)
            System.out.print(result+" ");
        }

    }
}
