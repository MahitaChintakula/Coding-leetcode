class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] fre=new int[26];
        int maxfre=0, maxlen=0, left=0, right=0;
        while(right < n){
            char ch=s.charAt(right);
            fre[ch - 'A']++;
            maxfre=Math.max(maxfre, fre[ch - 'A']);
            if((right-left+1)-maxfre > k){
                fre[s.charAt(left) - 'A']--;
                left++;
            }
            maxlen=Math.max(maxlen, (right-left+1));
            right++;
        }
        return maxlen;
    }
}