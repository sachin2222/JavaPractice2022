package Practice;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int a[]={3,5,60,2,1,10};
        int max=-999;
        int secondLargest=-999;

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    max=a[j];
                }

            }

            if(a[i]<max){
                secondLargest=a[i];
            }

        }
        System.out.println(max);
        System.out.println(secondLargest);

    }
}
