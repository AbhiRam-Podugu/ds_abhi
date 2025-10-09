class Solution {
    public void sortColors(int[] a) {
        int start = 0, end = a.length-1,mid=0;
        if(a.length == 1 || a.length == 0) return;
        while(end>=mid)
        {
            if(a[mid]==0) {
                swap(a,start,mid);
                start++;
                mid++;
            }
            else if(a[mid] == 1) mid++;
            else {
                swap(a,end,mid);
                end--;
            }
        }
    }
    private static void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}