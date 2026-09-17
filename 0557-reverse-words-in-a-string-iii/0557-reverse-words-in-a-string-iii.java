class Solution {
    public String reverseWords(String s) {
        String[] s1=s.trim().split("\\s+");
        StringBuilder st=new StringBuilder();
        StringBuilder stt=new StringBuilder();
        Stack<Character> sa=new Stack<>();
        for (int i =0; i <  s1.length; i++) {
            String a=s1[i];
            for(int k=0;k<a.length();k++){
                sa.push(a.charAt(k));
            }
            for(int k=0;k<a.length();k++){
                stt.append(sa.pop());
            }
            st.append(stt.toString());
            stt.setLength(0);
            if (i < s1.length-1) {
                st.append(" "); 
            }
        }
        return st.toString();
    }
}