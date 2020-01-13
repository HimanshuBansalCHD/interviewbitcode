/* https://www.interviewbit.com/problems/sorted-permutation-rank/  */

public class Solution {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=(fact*i)%1000003;
        }
        return (int)(fact%1000003);
    }
    public int findRank(String A) {
        int count=0,n=A.length()-1;
        int r=0;
        ArrayList<Integer> rank=new ArrayList<Integer>();
        for(int i=0;i<A.length();i++)
        {
            rank.add((int)A.charAt(i)-64);
        }
        for(int i=0;i<rank.size();i++)
        {
            for(int j=i;j<rank.size();j++)
            {
                if(rank.get(i)>rank.get(j))
                {
                    count++;
                }
            }
            r+=(count*fact(n--)%1000003);
            count=0;
        }
        return (r+1)%1000003;
    }
}

