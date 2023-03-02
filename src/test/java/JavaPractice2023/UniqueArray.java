package JavaPractice2023;

public class UniqueArray {

    public static void main(String[] args) {
        int a[] = {10, 21, 12, 10, 12};
        int count;
        for (int i = 0; i < a.length; i++) {
            count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = -999;
                }

            }//print unique elements
            // if(a[i]!=-999)
            //System.out.print(a[i]+" ");

            //print duplicate elements
            if (a[i] != -999 && count > 1)
                System.out.println(a[i] + " ");
        }

    }
}
