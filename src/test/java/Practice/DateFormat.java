package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {


    public  void display(){
        String s="my name is sachin";
        char ch[]=s.toCharArray();
        int i=0;

        while(i<ch.length){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                ch[i]='x';
            }
         i++;
        }
        System.out.println(new String(ch));


    }



    public static void main(String[] args) {
        new DateFormat().display();

    }
}
