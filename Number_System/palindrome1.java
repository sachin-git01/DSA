class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int x=n;
        int rev=0;
       while(n!=0){
           int y=n%10;
           rev=rev*10+y;
           n=n/10;
           
       }
       return rev==x;
    }
}
