class Solution {
    public int maxArea(int[] a) {
        int result = 0;
        int i = 0,j= a.length-1;
        while ( j > i)
        {
            int water = Math.min(a[i],a[j])*(j-i);
            if(a[i] > a[j]) j--;
            else i++;
            result = Math.max(water,result);
        }
        return result;
    }
}