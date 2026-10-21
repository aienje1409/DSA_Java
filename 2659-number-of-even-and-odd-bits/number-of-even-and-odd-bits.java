class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        int num=0;
        while(n!=0) {
            if((n&1) == 1 && num%2==0){
                ans[0]++;
            }
            if((n&1) ==1 && num%2!=0){
                ans[1]++;
            }
            n >>=1;
            num++;
        }
        return ans;
    }
}