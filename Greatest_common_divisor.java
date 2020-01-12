/* http://www.interviewbit.com/problems/greatest-common-divisor/ /*

public class Solution {
    public int gcd(int A, int B) {
        if(B%A==0)
        {
            return A;
        }
        else
        {
            return gcd(B%A,A);
        }
    }
}

