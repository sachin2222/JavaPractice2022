package arrays;

public class MoveNegativeNumbers {

    public static void main(String[] args) {
        int a[]={1,2,-2,0,1,-1,-3};//{1,2,0,1,-2,-1,-3}
        int result[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                result[k++]=a[i];
            }

        }
        for(int j=0;j<result.length;j++){
            if(a[j]<0)
                result[k++]=a[j];
        }

        for(int r:result){
            System.out.print(r+" ");
        }


    }
}
