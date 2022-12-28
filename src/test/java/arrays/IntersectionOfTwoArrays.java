package arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int a[]={4,9,5};
        int b[]={9,4,9,8,4};

        if(a.length>b.length){
          for(int i=0;i<b.length;i++){
              for(int j=0;j<a.length;j++){
                  if(b[i]==a[j]){
                      System.out.print(b[i]+" ");
                      break;
                  }
              }

          }

        }

        else
        {
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b.length;j++){
                    if(a[i]==b[j]){
                        System.out.print(a[i]+" ");
                        break;
                    }
                }

            }
        }
    }
}
