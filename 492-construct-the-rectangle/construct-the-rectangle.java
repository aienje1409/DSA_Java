class Solution {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        double root=Math.sqrt(area);
        for(int i=(int)root; i>=1; i--) {
            arr[1]=i;
            if(area % i ==0) {
                arr[0]= area/i;
                return arr;
            }
        }
        return arr;
    }
}