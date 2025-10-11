class Solution {
    public boolean isValid(String s) {
       Stack<Character> a = new Stack<>();
        if(s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(0) == ')') return false;
        for( int i = 0; i < s.length() ; i++ )
        {
            Character b = s.charAt(i);
            if( b == '{' || b == '[' || b == '(')
            {
                a.push(b);
            }
            else
            {
                if(a.isEmpty()) return false;
                char z = a.peek();
                if ( (s.charAt(i) == ']' && z == '[') ||
                     (s.charAt(i) == '}' && z == '{') ||
                     (s.charAt(i) == ')' && z == '('))
                     a.pop();
                else 
                {
                    return false;
                }

            }
        }
        if(a.isEmpty()) return true;
        else return false; 
    }
}

