class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String n : tokens){
            if(n.equals("+")){
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1+num2);
            }
            else if(n.equals("-")){
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1-num2);
            }
            else if(n.equals("*")){
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1*num2);
            }
            else if(n.equals("/")){
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1/num2);
            }
            else{
                stack.push(Integer.parseInt(n));
            }
        }
        return stack.peek();
    }
}