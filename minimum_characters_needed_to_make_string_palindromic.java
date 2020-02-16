/* https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/  */

public class Solution {
    public int solve(String a) {
        int j=a.length()-1,i=0;
        int count=0;
        while(i<=j)
        {
            if(a.charAt(i)==a.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
            if(i==0){
                j--;
                count++;
            }
            else{
                i--;
                count++;
            }
            }
        }
        return count;
    }
}

