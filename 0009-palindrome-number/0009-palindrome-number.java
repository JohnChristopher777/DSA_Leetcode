class Solution {
    public boolean isPalindrome(int x) {
        int revNum=0;
        int dup=x;

        if(x<0 || x%10==0 && x!=0) return false;
        
        if(x==0) return true;

        while(x>0){
            int ld=x%10;
            revNum=(revNum*10)+(x%10); 
            x /=10;               
        }  
        if (revNum==dup)    return true;
       
        return false;         
    }
}