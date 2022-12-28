package arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int a[]={0,0,3,6,-4,-5,0,1,10};
        int result[]=new int[a.length];


        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                result[k++]=a[i];
            }

        }

        for(int r:result){
            System.out.print(r+" ");
        }
    }
}
