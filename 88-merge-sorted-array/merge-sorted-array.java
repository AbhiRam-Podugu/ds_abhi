class Solution {
    public void merge(int[] a, int i, int[] b, int t) {
        int k = a.length-1,l = i;
        t--;
        i--;
        while (t >= 0 && i >= 0) 
        {
            if( b[t] > a[i] )
            {
                a[k--] = b[t--];
            }
            else
            {
                a[k--] = a[i--];
            }
        }
        while( t >= 0 )
        {
            a[k--] = b[t--];
        }
    }
}