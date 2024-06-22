import java.util.*;
public class MinInsertPalin{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int[][] dp=new int[s.length()][s.length()];
      for(int i=1;i<s.length();i++){
          for(int j=i,l=0;j<s.length();j++,l++){
              if(s.charAt(j)==s.charAt(l))
              dp[l][j]=dp[l+1][j-1];
              else{
                  dp[l][j]=Math.min(dp[l][j-1],dp[l+1][j])+1;
              }
          }
      }
      System.out.println(dp[0][s.length()-1]);
    }
}