class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder stack= new StringBuilder();
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(depth>0) stack.append(c);
                depth++;
            }
            else{
                depth--;
                if(depth>0) stack.append(c);
            }
        }
        
        return stack.toString();
    }
}