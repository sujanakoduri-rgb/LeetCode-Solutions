class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> ts = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(!st.isEmpty())st.pop();
            }
            else{
                st.push(ch);
            }
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c == '#'){
                if(!ts.isEmpty())ts.pop();
            }
            else{
                ts.push(c);
            }
        }
        while(!st.isEmpty() && !ts.isEmpty()){
            if(st.peek()==ts.peek()){st.pop(); ts.pop();}
            else{
                return false;
            }
        }
       return st.isEmpty() && ts.isEmpty();
    }
}