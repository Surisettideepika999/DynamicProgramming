
import java.util.Scanner;
public class MaxOfSeries{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] dp=new int[n+1];
      int max=Integer.MIN_VALUE;
      dp[1]=1;
      for(int i=1;i<=n;i++){
          if(i%2==0)
          dp[i]=dp[i/2];
          else
          dp[i]=dp[i/2]+dp[(i+1)/2];
          max=Math.max(max,dp[i]);
      }
      System.out.println("Maximum of the series :"+max);
    }
}