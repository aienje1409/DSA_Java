class Solution {
    public int binaryGap(int n) {
        int maxGap=0;
        int lastOccur=-1; //1st occur makes it +ve
        int gap=0;

        while(n>0) {
            if((n&1) == 1) {
                if(lastOccur != -1) {
                    maxGap = Math.max(maxGap, gap-lastOccur); //assigning maxgap
                }
                lastOccur = gap;  //updating reoccured set bit
            }
            n >>= 1;
            gap++;             //counting gaps
        }
        return maxGap;                      
    }
}     