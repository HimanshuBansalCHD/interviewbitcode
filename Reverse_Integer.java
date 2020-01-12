
/* https://www.interviewbit.com/problems/reverse-integer/  */

public class Solution {
    public int reverse(int A) {
        if(A>Integer.MAX_VALUE || A<Integer.MIN_VALUE)
        {
            return 0;
        }
        long rev=0;
        int negflag=0;
        if(A<0)
        {
            A=(-A);
            negflag=1;
        }
        while(A!=0) 
        {
            rev=rev*10+(A%10);
            A=A/10;
        }
        if(rev>Integer.MAX_VALUE)
        {
            return 0;
        }
        if(negflag==1)
        {
            return (int)(-rev);
        }
        else
        {
            return (int)rev;
        }
    }
}

