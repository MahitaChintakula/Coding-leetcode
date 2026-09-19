class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length()==0 || t.length()==0){
            return "";
        }
        HashMap<Character, Integer> need=new HashMap<>();
        for(char ch : t.toCharArray()){
            need.put(ch , need.getOrDefault(ch,0)+1);
        }
        HashMap<Character, Integer> window=new HashMap<>();
        int l=0,start=0;
        int minlen=Integer.MAX_VALUE;
        int required=need.size();
        int formed=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(need.containsKey(ch) && window.get(ch).equals(need.get(ch))){
                formed++;
            }
            while(formed == required){
                if(r-l+1 < minlen){
                    minlen=r-l+1;
                    start=l;
                }
                char leftchar=s.charAt(l);
                window.put(leftchar, window.get(leftchar)-1);
                if(need.containsKey(leftchar) && window.get(leftchar) < need.get(leftchar)){
                formed--;
            }
            l++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start+minlen);
    }
}