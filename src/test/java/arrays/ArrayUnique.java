package arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayUnique {

    public static void main(String[] args) {
        int a[] = {1, 111, 2, 1, 11, 111};

         Arrays.stream(a).distinct().forEach(s-> System.out.println(s));

    }
}
