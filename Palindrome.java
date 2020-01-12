/* http://www.interviewbit.com/problems/palindrome-integer/ */

public class Solution {
    public int isPalindrome(int A) {
        int rev=0,x=A;
        if(A<0){ return 0;}
        while(A!=0)
        {
            rev=rev*10+(A%10);
            A=A/10;
        }
        rev==x?(return 1;):(return 0;);
    }
}

