package Practice;

public class arrayDigitSum {

    public static int add(int m, int n){
        int result=m+n;
        return result;

    }

    public static void main(String[] args) {
        int a[]= {1,2,5,6,7,9};

        for(int i=0;i<a.length;i++){
          int N=  add(a[i],a[i+1]);

        }
    }
}
