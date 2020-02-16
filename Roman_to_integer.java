/* https://www.interviewbit.com/problems/roman-to-integer/  */

public class Solution {
    public int romanToInt(String A) {
        if(A.length()==0) return 0;
        HashMap<String,Integer> mp=new HashMap<String,Integer>();
        mp.put("X",10);
        mp.put("V",5);
        mp.put("I",1);
        mp.put("L",50);
        mp.put("C",100);
        mp.put("D",500);
        mp.put("M",1000);
        int sum=0;
        for(int i=A.length()-1;i>=0;i--)
        {
            if(i==A.length()-1)
            {
                sum=mp.get(Character.toString(A.charAt(i)));
            }
            else
            {
                if(mp.get(Character.toString(A.charAt(i)))>=mp.get(Character.toString(A.charAt(i+1))))
                {
                    sum=sum+mp.get(Character.toString(A.charAt(i)));
                }
                else
                {
                    sum=sum-mp.get(Character.toString(A.charAt(i)));
                }
            }
        }
        return sum;
    }
}

