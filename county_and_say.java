/* https://www.interviewbit.com/problems/count-and-say/  */

public class Solution {
    public String countAndSay(int A) {
        int count=0;
        char c='a';
        StringBuilder s1=new StringBuilder("1");
        for(int j=1;j<A;j++)
        {
            String s2="";
            for(int i=0;i<s1.length();i++)
            {
                if(count==0)
                {
                    c=s1.charAt(i);
                    count++;
                }
                else if(c==s1.charAt(i))
                {
                    count++;
                }
                if(i==s1.length()-1 || c!=s1.charAt(i+1))
                {
                    s2=s2+count;
                    s2=s2+c;
                    count=0;
                }
            }
            s1=new StringBuilder(s2);
        }
        return s1.toString();
    }
}
