class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> charset=new HashSet<>();
        int ml=0;
        int left=0;
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            if(!charset.contains(c)){
                charset.add(c);
                ml=Math.max(ml,right-left+1);
            }
            else{
                while(charset.contains(c)){
                    charset.remove(s.charAt(left));
                    left++;
                }
                charset.add(s.charAt(right));
            }
        }
        return ml;
    }
}