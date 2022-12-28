package arrays;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {
        int a[]={1,0,10,34,123,345};

        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);

    }
}
