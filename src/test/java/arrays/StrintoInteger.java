package arrays;

public class StrintoInteger {


    private static void displayResult(String s) {
        char ch[]=s.toCharArray();
        boolean flag=false;
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                flag=true;
            }
        }

        if(flag==true)
            System.out.println(s);
    }

    public static void main(String[] args) throws NumberFormatException{
        String s="-4193 hello 7865 hello234";
        String ch[]=s.split(" ");

        for(int i=0;i<ch.length;i++){

            displayResult(ch[i]);

            }

        }



}

