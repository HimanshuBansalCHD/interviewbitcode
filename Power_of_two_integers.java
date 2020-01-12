
/* https://www.interviewbit.com/problems/power-of-two-integers/ */

public class Solution {
    public int isPower(int A) {
        int x=(int)Math.sqrt(A);
        if(x*x==A){return 1;}
        for(int i=1;i<Math.sqrt(A);i++)
        {
            if((float)(Math.log(A)/Math.log(i))==(int)(Math.log(A)/Math.log(i)))
            {
                return 1;
            }
        }
        return 0;
    }
}
