package Practice;

import javax.swing.*;
import java.util.ArrayList;

public class ArraysSum {

    public static void display(int i, int j, ArrayList<Integer> al){
        for(int k=0;k<al.size();k++){

        }
    }

    public static void main(String[] args) {
        int a[]={3,4,5,1,10,45,9,-23,-1,0};
        ArrayList<Integer> sum=new ArrayList<>();
        int max=-999;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-1;j++){
                sum.add(a[i]+a[j]);
                for(int k=0;k<sum.size();k++){
                    if(sum.get(k)>max){
                        max=sum.get(k);
                    }
                }
   }

            }



        }
        //System.out.println(max);


        //System.out.println(max);


    }

