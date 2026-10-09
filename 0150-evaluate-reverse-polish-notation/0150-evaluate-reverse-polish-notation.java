class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(str.equals("+")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a+b);
            } else if(str.equals("*")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a*b);
            }else if(str.equals("-")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }else if(str.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        
        return stack.peek();
    }
}