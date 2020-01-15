/* https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/  */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        int size=A.size();
        int sum=0;
        for(int i=0;i<31;i++)
        {
            int countone=0;
            for(int j=0;j<size;j++) {
                countone+=(A.get(j) & 1 << i)!=0?1:0;
            }
            int countzero=size-countone;
            sum+=(2L*countone*countzero)%1000000007;
            sum=sum%1000000007;
        }
        return sum;
    }
}
