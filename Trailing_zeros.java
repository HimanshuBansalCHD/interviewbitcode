/* http://www.interviewbit.com/problems/trailing-zeros-in-factorial/ */

public class Solution {
    public int trailingZeroes(int A) {
        int zeros=0;
        while(A!=0)
        {
            zeros+=A/5;
            A=A/5;
        }
        return zeros;
    }
}

