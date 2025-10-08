class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        int d = k%n;
        rotateseg(a,0,n-1);
        rotateseg(a,0,d-1);
        rotateseg(a,d,n-1);
        
    }
    private void rotateseg(int[] a,int left,int right)
    {
        while(right > left)
        {
            int t = a[left];
            a[left] = a[right];
            a[right] = t;
            left++;
            right--;
        }
    }
}