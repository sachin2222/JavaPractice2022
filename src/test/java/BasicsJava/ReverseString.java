package BasicsJava;

public class ReverseString {

    public static void reverseString(String s) {
        char ch[] = s.toCharArray();
        int j = ch.length - 1;
        char temp;

        for (int i = 0; i < ch.length / 2; i++) {

            temp=ch[i];
            ch[i] = ch[j];
            ch[j]=temp;
            j--;
        }

        System.out.println(new String(ch));

    }

    public static void main(String[] args) {
        String s = "hello world";
        reverseString(s);

   /*     String rev = "";


        for (int i = 0; i < s.length(); i++) {

            rev = rev + s.charAt(s.length() - 1 - i);

        }

        System.out.println(rev);
    }*/
    }
}
