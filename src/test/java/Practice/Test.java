package Practice;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        int a[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int c : a) {

            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else
                hashMap.put(c, 1);
        }

        int count = 0;

        for (Map.Entry entry : hashMap.entrySet()) {

            count++;

        }

        int arr[]=new int[count];
        int i=0;

        for (Map.Entry entry : hashMap.entrySet()) {

            arr[i++]=(Integer)entry.getKey();
        }

        for(int k: arr){
            System.out.print(k+" ");
        }


    }


}



