import java.util.*;
public class CountBits{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int[] dp=new int[N+1];
      for(int i=1;i<=N;i++){
          dp[i]=dp[i/2]+i%2;
      }
      System.out.println("No of bits :");
      for(int i=0;i<=N;i++)
      System.out.print(dp[i]+" ");
    }
}