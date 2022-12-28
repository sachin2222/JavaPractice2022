public class LCM {

    private static void lcm(int a, int b) {
        int min=999;
        if(a>b){
            for(int i=2;i<b;i++){
                if(a%i==0 && b%i==0 && i<min){
                    System.out.print(i+" ");
                    min=i;
                }
            }
        }


    }
    public static void main(String[] args) {
        int a=150;
        int b=55;
        lcm(a,b);
    }


}
