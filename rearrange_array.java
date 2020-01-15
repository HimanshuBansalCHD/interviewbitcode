/* https://www.interviewbit.com/problems/rearrange-array/  */

public class Solution {
    public void arrange(ArrayList<Integer> a) {
        int n=a.size(),x=0;
        for(int i=0;i<n;i++)
        {
            x=a.get(a.get(i));
            a.set(i,(a.get(i)+(x%n)*n));
        }
        for(int i=0;i<n;i++)
        {
            a.set(i,a.get(i)/n);
        }
    }
}

