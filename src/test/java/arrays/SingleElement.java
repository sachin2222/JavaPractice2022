package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleElement {

    public static void main(String[] args) {
        int a[]={4,1,2,1,2};

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int c:a){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }
            else
                hashMap.put(c,1);


        }


        System.out.println(hashMap);
        for(Map.Entry entry:hashMap.entrySet()){
            if((int)entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }



    }
}
