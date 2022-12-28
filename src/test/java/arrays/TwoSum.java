package arrays;

import io.netty.util.concurrent.SingleThreadEventExecutor;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    private static void display(int target, int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.print(i + " " + j);
                }

            }
        }
    }


    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};

        int sum = -999;


        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (sum < a[i] + a[j]) {
                    sum = a[i] + a[j];
                }


            }

        }

        System.out.println(sum);
        display(sum, a);

    }

}


