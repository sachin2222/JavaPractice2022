package arrays;

public class MedianTwoArrays {

    public static void main(String[] args) {
        int a[] = {1, 3};
        int b[] = {2};
        int Num = a.length + b.length;
        int median = 0;

        int temp[] = new int[Num];
        for (int i = 0; i < Num; i++) {
            if (i < a.length) {
                temp[i] = a[i];
            } else
                temp[i] = b[i - a.length];
        }

        for(int t=0;t< temp.length;t++){

            System.out.println(t);
        }
        

        if (Num % 2 == 0) {
            System.out.println("even");
            median = (temp[Num / 2] + temp[Num / 2 + 1]) / 2;
        } else {
            System.out.println("Odd"+Num);
            int k=Math.round(Num/2);
            System.out.println("k"+k);
            median = temp[k];
        }


        System.out.println(median);
    }
}
