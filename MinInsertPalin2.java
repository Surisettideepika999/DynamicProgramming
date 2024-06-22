import java.util.*;
public class MinInsertPalin2{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String S=sc.next();
     StringBuilder sb=new StringBuilder(S);
        String r=sb.reverse().toString();
        int[][] dp=new int[S.length()+1][S.length()+1];
        int n=S.length();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(r.charAt(j-1)==S.charAt(i-1))
                dp[i][j]=dp[i-1][j-1]+1;
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println("no of insertions to make it palindrome "+(S.length()-dp[n][n]));
    }
}