package arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int a[] = {0, 0, 0, 1, 4, 2, 3, 3, 1};
        List<Integer> list = new ArrayList<>();

        for (int c : a) {
            list.add(c);
        }

        System.out.println(list);
        System.out.println(list.stream().distinct().count());
        list.stream().sorted().distinct().forEach(s-> System.out.print(s+" "));

    }
}
