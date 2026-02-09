class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r=0;
        int temp=x;
        while(x!=0){
            r=(x%10)+(r*10);
            x /=10;
        
        }
        return r == temp;
    }
}
