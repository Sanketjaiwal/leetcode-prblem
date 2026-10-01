class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int top=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
                top++;
            }
            else {
                if(top==0) return false;
                else if(stack.peek()=='('&&s.charAt(i)==')'){
                    stack.pop();
                    top--;
                }
                else if(stack.peek()=='{'&&s.charAt(i)=='}'){
                    stack.pop();
                    top--;
                }
                else if(stack.peek()=='['&&s.charAt(i)==']'){
                    stack.pop();
                    top--;
                }
                else
                return false;
            }
        }
        return top<=0? true: false;        
    }
}