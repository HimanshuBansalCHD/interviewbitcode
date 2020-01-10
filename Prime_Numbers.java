public class Solution {
    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> prime=new ArrayList<Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<A;i++)
        {
            prime.add(1);
        }
        prime.set(0,0);
        prime.set(1,0);
        int j=2;
        for(int i=2;i<Math.sqrt(A);i++)
        {
            if(prime.get(i)==1)
            {
                while(j*i<A)
                {
                    prime.set(i*j,0);
                    j++;
                }
            }
        }
        for(int i=0;i<prime.size();i++)
        {
            if(prime.get(i)==1)
            {
                result.add(i);
            }
        }
        return result;
    }
}

