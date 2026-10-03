class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                a.push(ch);
            }
            else{
                if(a.isEmpty()) return false;
                char c=a.pop();
                if(ch==')' && c!='(') return false;
                if(ch=='}' && c!='{') return false;
                if(ch==']' && c!='[') return false;
            }
        }
        return a.isEmpty();
    }
}