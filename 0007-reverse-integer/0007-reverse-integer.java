class Solution {
    public int reverse(int x) {
        int revNum =0;

        if(x==0) return 0;
        
        while(x != 0){
            int ld = x%10;
            int newrevNum= revNum*10 + ld;

            if((newrevNum-ld)/10 != revNum){
                return 0;
            }
            revNum = newrevNum;
            x=x/10;
        }

        return revNum;
    }
}