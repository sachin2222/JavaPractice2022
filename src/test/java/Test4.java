public class Test4 {

    public  int fun(int n,int k){
          int flag=0;

        if(n<=0){
            flag=1;
            n=n+k;
            System.out.print(n+" ");
            return fun(n,k);
        }

        else if(n>0){
            n=n-k;
            System.out.print(n+" ");
            return fun(n,k);
        }

        else
            return 0;

    }

    public static void main(String[] args) {
        int n=20;
        int k=6;
        System.out.print(n+" ");
      new Test4().fun(n,k);
    }
}
