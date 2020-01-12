/* https://www.interviewbit.com/problems/excel-column-title/ */

public class Solution {
    public String convertToTitle(int A) {
        String res="";
        char c;
        while(A!=0)
        {
            if (A % 26 == 0) {
                c = 64+26;
            } else {
                c = (char) ((A % 26) + 64);
            }
            res=c+res;
            A=(A-1)/26;
        }
        return res;
    }
}

