import java.util.*;
public class MakePalindrome{
    public static int palin(char s[], int l, int h)
    {
       if(l>h)
       return Integer.MAX_VALUE;
       if(l==h)
       return 0;
       if(l==h-1){
           if(s[l]==s[h])
           return 0;
           else
           return 1;
       }
       if(s[l]==s[h]){
           return palin(s,l+1,h-1);
       }
       else
       return Math.min(palin(s,l+1,h),palin(s,l,h-1))+1;
    
}
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
          System.out.println(palin(s.toCharArray(),0,s.length()-1));
    }
}