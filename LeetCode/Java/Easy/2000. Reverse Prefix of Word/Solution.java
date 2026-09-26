class Solution {
    public String reversePrefix(String word, char ch) {
        String s = "";
        Stack st = new Stack<>();
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            st.push(c);
            if(c==ch){
                while(!st.isEmpty()){
                 s = s + st.pop();
                }
            s = s+ word.substring(i+1);
            return s;
    }
}
return word;
}
}