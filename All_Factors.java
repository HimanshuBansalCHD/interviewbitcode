public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        int upperlimit=(int)Math.sqrt(A);
        ArrayList<Integer> res=new ArrayList<Integer>();
        LinkedList<Integer> rest=new LinkedList<Integer>();
        if(A==1) 
        {
            res.add(1);
            return res;
        }
        for(int i=1;i<=upperlimit;i++)
        {
            if( A%i == 0 )
            {
                res.add(i);
                if(!(res.contains(A/i)))
                {
                    
                    rest.addFirst(A/i);
                }
            }
        }res.addAll(rest);
        return res;
    }
}

