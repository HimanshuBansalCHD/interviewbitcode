public class Solution {
    public String findDigitsInBinary(int A) {
        String res="";
        if(A==0) return Integer.toString(0);
        while(A!=0)
        {
            res=Integer.toString(A%2)+res;
            A=A/2;
        }
        return res;
    }
}

