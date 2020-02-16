/*  https://www.interviewbit.com/problems/power-of-2/   */

import java.math.BigInteger;
public class Solution {
    public int power(String A) {
        BigInteger i=new BigInteger(A);
        if(i.equals(BigInteger.valueOf(0))) return 0;
        if(i.equals(BigInteger.valueOf(1))) return 0;
        while(i.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
        {
            i=i.divide(BigInteger.valueOf(2));
        }
        if(i.equals(BigInteger.valueOf(1))){
            return 1;
        }
        else {
            return 0;
        }
    }
}

