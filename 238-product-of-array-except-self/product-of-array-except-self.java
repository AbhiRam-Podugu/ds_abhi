class Solution {
    public int[] productExceptSelf(int[] a) {
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        int result[] = new int[a.length];
        int product =1;
        for(int i = 0; i < a.length; i++)
        {
            product *= a[i];
            left[i] = product;
        }
        product = 1;
        for(int i = a.length-1; i>=0; i-- )
        {
            product *= a[i];
            right[i] = product;
        }
       for(int i = 1; i < a.length-1;i++)
       {
         result[i] = left[i-1]*right[i+1];
       }
       result[0] = right[1];
       result[left.length-1] = left[left.length-2];
       return result; 
    }
}