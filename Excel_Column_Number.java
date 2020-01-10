public class Solution {
    public int titleToNumber(String A) {
        int j=A.length()-1,number=0;
        for(int i=0;i<A.length();i++)
        {
            number+=Math.pow(26,i)*(A.charAt(j--)-64);
        }
        return number;
    }
}
