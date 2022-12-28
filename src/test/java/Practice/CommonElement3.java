package Practice;

public class CommonElement3 {
    public static void main(String[] args) {

        int input1[] = {1, 5, 10, 20, 40, 80};
        int input2[] = {6, 7, 20, 80, 100};
        int input3[] = {3, 4, 15, 20, 30, 70, 80, 120};



        for(int i=0;i<input1.length;i++){
            int temp1=0;
            int temp2=0;

            for(int j=0;j<input2.length;j++){
                if(input1[i]==input2[j]){
                   temp1=1;
                }

            }

            for(int j=0;j<input3.length;j++){
                if(input1[i]==input3[j]){
                    temp2=1;
                }

            }

            if(temp1==1 && temp2==1){
                System.out.println(input1[i]);
            }

        }



    }
}
