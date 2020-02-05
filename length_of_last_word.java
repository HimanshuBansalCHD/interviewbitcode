/* https://www.interviewbit.com/problems/length-of-last-word/ */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        String[] x=A.split(" ");
        if(x.length==0){
            return 0;
        }
        return x[(x.length-1)].length();
    }
}
