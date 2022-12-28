package Practice;

public class RemovalSpeacialCharacter {

    public static void main(String[] args) {
        String s="info$sy&&s";

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){

            if(ch[i]=='$'||ch[i]=='&'){
                ch[i]=' ';

            }
        }
   /*     int space=0;
        for(int i=0;i<ch.length;i++){

            if(ch[i]==' '){
                space++;
            }


        }

        char nch[]=new char[ch.length-space];

        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' ')
                nch[i]=ch[i];
        }*/
        System.out.println(new String(ch));


    }
}
