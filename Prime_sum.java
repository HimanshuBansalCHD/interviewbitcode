public class Solution {
    public static boolean p(int a)
    {
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=2;i<=a/2;i++)
        {
            if(p(i) && p(a-i))
            {
                result.add(i);
                result.add(a-i);
                break;
            }
        }
        return result;
    }
}
