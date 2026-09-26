class Solution {
    public int calPoints(String[] a) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i].equals("C")){
                st.pop();
            }
            else if(a[i].equals("D")){
                int d = 2*st.peek();
                st.push(d);
            }
            else if(a[i].equals("+")){
                int s1 = st.pop();
                //st.pop();
                int s2 = st.peek();
                st.push(s1);
                st.push(s1+s2);
            }
            else{
                st.push(Integer.parseInt(a[i]));
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}