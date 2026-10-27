class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int now = n&1;
        n >>= 1;
        while(n!=0){
            int bit = n & 1;
            if(now == bit){
                return false;
            }
            n >>= 1;
            now=bit;
        }

        return true;
    }
}