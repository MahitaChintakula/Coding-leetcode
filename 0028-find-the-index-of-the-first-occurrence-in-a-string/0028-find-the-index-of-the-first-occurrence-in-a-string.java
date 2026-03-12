class Solution {
    public int strStr(String haystack, String needle) {
            int hl=haystack.length();
            int nl=needle.length();
            int nIndex=0;
            for(int i=0;i<hl;i++){
                if(haystack.charAt(i)==needle.charAt(nIndex)){
                    nIndex++;
                }
                else{
                    i=i-nIndex;
                    nIndex=0;
                }
                if(nIndex==nl){
                    return i-nl+1;
                }
            }
        return -1;
    }
}