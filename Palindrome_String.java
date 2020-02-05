/* https://www.interviewbit.com/problems/palindrome-string/ */

public class Solution {
    public int isPalindrome(String A) {
        A=A.toUpperCase();
        int length=A.length()-1;
        for(int i=0;i<=(length);i++)
        {
            if(Character.isLetterOrDigit(A.charAt(i)) && Character.isLetterOrDigit(A.charAt(length)))
            {
                if(A.charAt(i)!=A.charAt(length--))
                {
                    return 0;
                }
            }
            else
            {
                if(!Character.isLetterOrDigit(A.charAt(length))){
                    if(Character.isLetterOrDigit(A.charAt(i))) {
                        {
                            length--;
                            i--;
                        }
                    }
                    else{
                            length--;
                        }
                    }
            }
        }
        return 1;
    }
}

