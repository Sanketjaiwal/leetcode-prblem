class Solution {
    public String reverseWords(String s) {
        String[] s1=s.trim().split("\\s+");
        StringBuilder st=new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            st.append(s1[i]);
            if (i > 0) {
                st.append(" "); 
            }
        }
        return st.toString();
    }
}