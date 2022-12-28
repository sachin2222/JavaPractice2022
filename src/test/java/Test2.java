import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int n=76;

        int square=n*n;
        //System.out.println(square);
        int lasttwodigit=0;
        int countdigits=0;

        while(square!=0){
            square=square%10;
            countdigits++;
            square=square/10;
        }

        System.out.println(countdigits+" number of digits");


        int r=square%100;


        lasttwodigit=r;
        //System.out.println(lasttwodigit);

        if(lasttwodigit==n)
            System.out.println("Number is automorphic");
        else
            System.out.println("Number is not automorphic");




    }
}
