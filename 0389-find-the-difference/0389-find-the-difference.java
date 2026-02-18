class Solution {
    public char findTheDifference(String s, String t) {
    //     char res=0;
    //    for(int i=0;i<s.length();i++){
    //     res ^= s.charAt(i);
    //    }
    //    for(int i=0;i<t.length();i++){
    //     res ^= t.charAt(i);
    //    }
    //    return res;
    int[] count=new int[26];
    for(char c:s.toCharArray()){
        count[c - 'a']++;
    }
    for(char c:t.toCharArray()){
        count[c-'a']--;
        if(count[c-'a']<0){
            return c;
        }
     }
     return ' ';
    }
}