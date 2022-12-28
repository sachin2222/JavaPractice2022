package Practice;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        String s5 = "  abc  def\t";

        s5 = s5.strip();

        System.out.println(s5);

        String s="india is my country";

        String result="";

        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++){
            result=result+s1[i];

        }

        System.out.println(result);
    }
}
