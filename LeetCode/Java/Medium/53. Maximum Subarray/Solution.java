class Solution {
    public int maxSubArray(int[] a) {
        int cs= a[0];
        int ms = a[0];
        for(int i=1;i<a.length;i++){
            cs = Math.max(a[i],cs+a[i]);
            ms = Math.max(cs,ms);
        }
        return ms;
    }
}