package arrays;

public class RotateArrays {

    public static void main(String[] args) {
        int a[] = {10, 20, 45, 78, 12};// {12,10,20,45,78}
        int length = a.length;
        int k = 1;

        int temp=0;
        for (int i = 0; i < a.length;i++) {
            int j=(i+k)%length;
            a[1]=a[0];
            //System.out.println(j+" "+i);

        }

        for (int i = 0; i < a.length;i++) {
            System.out.println(a[i]);


        }


    }
}
