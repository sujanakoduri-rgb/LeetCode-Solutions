class Solution {
    public int minAddToMakeValid(String s) {

        int o = 0;
        int e = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                o++;
            }
            else if(o > 0) {
                o--;
            }
            else {
                e++;
            }
        }

        return o + e;
    }
}