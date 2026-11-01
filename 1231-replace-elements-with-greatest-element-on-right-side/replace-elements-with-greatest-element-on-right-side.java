class Solution {
    public int[] replaceElements(int[] arr) {
        int e=arr.length-1;
        int max=0;
        int ans[] = new int[arr.length];
        ans[e]=-1;
        for(int i=arr.length-2; i>=0; i--){
           
            if(max<arr[i+1]){
                max=arr[i+1];
            }
            ans[i] =max;
        }
        return ans;

    }
}