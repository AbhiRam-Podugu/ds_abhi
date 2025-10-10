class Solution {
    public int trap(int[] a) {
        int n = a.length,y=0;
        int [] leftmax = new int[n];
        int [] rightmax = new int[n];
        int water = 0;
        for(int i = 0; i < n ; i++ )
        {
            y = Math.max(a[i],y);
            leftmax[i] = y;
        }
        y = 0;
         for(int i = n-1; i >= 0 ; i-- )
        {
            y = Math.max(a[i],y);
            rightmax[i] = y;
        }
        for(int i = 1; i < a.length-1; i++ )
        {
            water += Math.min(leftmax[i],rightmax[i])-a[i];
        }
        return water;
    }
}