class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        gen(n,0,0,"",ans);
        return ans;
    }
    public void gen(int n,int open , int close , String s,List<String> ans){
        if(s.length()==2*n) {
            ans.add(s);
            return ;
        }
        if(open<n){
            gen(n,open+1,close,s+"(",ans);
        }
        if(close<open){
            gen(n,open,close+1,s+")",ans);
        }
    }
}