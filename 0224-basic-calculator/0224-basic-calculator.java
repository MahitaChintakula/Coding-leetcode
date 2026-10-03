class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int num=0;
        int sign=1;
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='-' || ch=='+'){
                res=res+num*sign;
                sign=(ch=='-') ? -1 : 1;
                num=0;
            }
            else if(ch=='('){
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
            }
            else if(ch==')'){
                res=res+num*sign;
                res *=stack.pop();
                res +=stack.pop();
                num=0;
            }
        }
        return res+(num*sign);
    }
}