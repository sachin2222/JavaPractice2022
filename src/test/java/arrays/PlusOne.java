package arrays;

public class PlusOne {

    public static void main(String[] args) {
        int a[]={1,2,3};
        a[a.length-1]=a[a.length-1]+1;
        int num=0;
        int temp= (int) Math.pow(10,a.length-1);

        for(int c:a){
            num+=c*temp;
            temp=temp/10;
        }


        int i=0;
        int result[]=new int[a.length];
        while(num!=0){
            int r=num%10;
            result[i]=r;
            i++;
            num=num/10;
        }

        for(int k=result.length-1;k>=0;k--){
            System.out.print(result[k]+" ");
        }


    }
}
