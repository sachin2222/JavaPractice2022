public class Test3 {


    public static void checkAutoMorphic(int temp){
        int n=temp;
        int square=n*n;


        int count=0;

        while(n!=0){
            count++;
            n=n/10;
        }

        int r= (int) (square%Math.pow(10,count));

        if(r==temp)
            System.out.println("automorphic Number " +temp);


    }

    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            checkAutoMorphic(i);
        }

    }
}
