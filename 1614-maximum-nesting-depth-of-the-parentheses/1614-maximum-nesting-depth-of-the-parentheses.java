class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int top=0,max=0;
        for(int i=0;i<s.length();i++){
            if(max<top)
            max=top;
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                top++;
            }
            else if(s.charAt(i)==')'){
                stack.pop();
                top--;
            }
        }
        return max;
    }
}