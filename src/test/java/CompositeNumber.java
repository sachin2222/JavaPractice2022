public class CompositeNumber {

    private static void checkComposite(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count!=2)
            System.out.println(n +" is composite Number");
        if(count==2)
            System.out.println(n+"is Prime Number");
    }
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            checkComposite(i);
        }


    }


}
