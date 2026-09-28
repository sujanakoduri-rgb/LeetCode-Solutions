class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
         String str = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
            if(!st.isEmpty()){
                str +=ch;
            }
        st.push(ch);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                str +=ch;
            }
            }
        }
       // String str = "";
    
        return str;
    }
}