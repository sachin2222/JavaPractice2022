public class Test {


    public static void checkVowels(String s){

        char ch[]=s.toCharArray();
        int count=0;


        for(int i=0;i<s.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'){
               count++;
            }
        }

        if(s.length()==count){
            System.out.println("All Vowels "+s);
        }

    }

    public static void main(String[] args) {
        String s = "rescueoperation";
        int k=3;

        for (int i = 0; i < s.length()-k; i++) {
            String s1 = s.substring(i, k+i);
            checkVowels(s1);

        }


    }
}
