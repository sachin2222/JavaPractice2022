package arrays;

public class CyclicallyRotate {

    public static void main(String[] args) {
        int a[]={2,1,10,90,12};// 12,2,1,10,90
        int temp[]=new int[a.length];

        for(int i=1;i< a.length;i++){
            temp[i]=a[i-1];
        }
        temp[0]=a[a.length-1];

        for(int v:temp){
            System.out.println(v);
        }
    }
}
