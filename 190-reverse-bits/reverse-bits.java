class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            // 1. Shift existing bits of ans to the left to make room for the new bit
            ans = (ans << 1) | (n & 1);
            
            // 2. Shift n to the right to process the next bit in the next iteration
            n >>= 1;
        }
        return ans;
    }
}
