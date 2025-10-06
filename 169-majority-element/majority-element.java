class Solution {
    public int majorityElement(int[] a) {
        int majorityElement = a[0];
        int count = 1;
        for( int i = 1 ; i < a.length ; i++ )
        {
            //abhiram_
            if (count == 0 ) majorityElement = a[i];
            if ( a[i] == majorityElement )
                count++;
            else
                count--;
        }
        return majorityElement;
    }
}
