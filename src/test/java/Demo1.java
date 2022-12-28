import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("sachin","sharma","1","10.5","10","-20");
        System.out.println(list);

        for(String s:list){
            for(int i=0;i<s.length();i++){
               char ch= s.charAt(i);
               if(Character.isDigit(ch)){
                   System.out.print(ch+" ");
               }
            }
        }
    }
}
