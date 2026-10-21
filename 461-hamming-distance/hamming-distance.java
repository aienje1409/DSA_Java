class Solution {
    public int hammingDistance(int x, int y) {
        int ans = x^y;
        int dist = 0;

        while(ans!=0){
            ans = ans & (ans-1);
            dist++;
        }
        return dist;
    }
}