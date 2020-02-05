/* https://www.interviewbit.com/problems/reverse-the-string/ */

public class Solution {
    public String solve(String A) {
        StringBuilder s=new StringBuilder();
        String[] x=A.split(" ");
        for(int i=x.length-1;i>=0;i--)
        {
            s=s.append(x[i]);
            if(i!=0){
            s=s.append(" ");
            }
        }
        return s.toString();
    }
}
