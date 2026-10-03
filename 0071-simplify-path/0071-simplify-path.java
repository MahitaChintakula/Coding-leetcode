class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] com=path.split("/");
        for(String dir : com){
            if(dir.equals("") || dir.equals(".")){
                continue;
            }
            else if(dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(dir);
            }
        }
        StringBuilder result=new StringBuilder();
        for(String dir : stack){
            result.append("/").append(dir);
        }
        return result.length()==0 ? "/" : result.toString();
    }
}