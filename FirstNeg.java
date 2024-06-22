import java.util.*;
public class FirstNeg{
    static public void first(int[] arr,int n,int k){
        int c=0;
        for(int i=0;i<=n-k;i++){
            c=0;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.print(arr[j]+" ");
                    break;
                }
                else c++;
            }
            if(c==k)
            System.out.print(0+" ");
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int k=sc.nextInt();
          first(arr,n,k);
    }
}