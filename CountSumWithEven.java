import java.util.*;
public class CountSumWithEven{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int[] dp=new int[N+1];
      dp[2]=1;
      for(int i=4;i<=N;i=i+2){
          dp[i]=2*dp[i-2];
      }
      System.out.println(dp[N]);
    }
}