package Practice;

public class RotateArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        //{5,6,7,1,2,3,4}
        int temp=0;
        for(int i=0;i<=0;i++){
            a[i+1]=a[i];
            a[i]=a[a.length-1-i];

        }

        for(int c:a){
            System.out.print(c+" ");
        }
    }
}
