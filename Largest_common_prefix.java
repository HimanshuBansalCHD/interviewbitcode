/* https://www.interviewbit.com/problems/longest-common-prefix/ */

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        if(A.size()==1){return A.get(0);}
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i).length()==0)
            {
                return "";
            }
        }
        int min=A.get(0).length();
        for(int i=0;i<A.size();i++)
        {
            if(min>A.get(i).length())
            {
                min=A.get(i).length();
            }
        }
        // System.out.println(min);
        int length=0,index=0;
        boolean flag=false;
        char c;
        for(int j=0;j<min;j++)
        {
            if(!flag)
            {
            c=A.get(0).charAt(j);
            // System.out.println(c);
            for(int i=0;i<A.size();i++)
            {
                if(c!=A.get(i).charAt(j))
                {
                    index=j;
                    flag=true;
                    break;
                }
            }
            }
            else{
                break;
            }
        }
        System.out.println(index);
        return A.get(0).substring(0,index);
    }
}

