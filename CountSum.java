import java.util.*;
public class CountSum{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int N=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int[] dp=new int[N+1];
      dp[0]=1;
      for(int i=1;i<=N;i++){
          for(Integer x:a){
              if(i>=x)
              dp[i]=dp[i]+dp[i-x];
          }
      }
      System.out.println(dp[N]);
    }
}