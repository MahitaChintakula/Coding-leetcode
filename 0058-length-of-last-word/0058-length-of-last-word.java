class Solution {
    public int lengthOfLastWord(String s) {
        s=s.strip();
        String[] words=s.split("\\s+");
        if(words.length==0){
            return 0;
        }
        String lastword=words[words.length-1];
        return lastword.length();
    }
}