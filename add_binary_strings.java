/* https://www.interviewbit.com/problems/add-binary-strings/  */

import java.math.BigInteger;
public class Solution {
    public String addBinary(String A, String B) {
        BigInteger x=new BigInteger(A,2);
        BigInteger y=new BigInteger(B,2);
        return (x.add(y)).toString(2);
        }
}

