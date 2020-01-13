/* https://www.interviewbit.com/problems/largest-coprime-divisor/  */

public class Solution {
    public static int gcd(int a,int b)
    {
        if(b%a==0)
        {
            return a;
        }
        return gcd(b%a,a);
    }
    public int cpFact(int A, int B) {
        int x=0,flag=0;
        if(gcd(A,B)==1)
        {
            return A;
        }
        while(x!=1)
        {
            x=gcd(A,B);
            A=A/gcd(A,B);
        }
        return A;
    }
}

