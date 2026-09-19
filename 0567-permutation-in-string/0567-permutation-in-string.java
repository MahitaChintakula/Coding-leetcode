class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0 || s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> win = new HashMap<>();
        int l = 0;
        int required = map.size();
        int formed = 0;
        for (int r = 0; r < s2.length(); r++) {
            char ch = s2.charAt(r);
            win.put(ch, win.getOrDefault(ch, 0) + 1);
            if (map.containsKey(ch)) {
                if (win.get(ch).equals(map.get(ch))) {
                    formed++;
                }
                else if (win.get(ch).equals(map.get(ch) + 1)) {
                    formed--;
                }
            }
            if (r - l + 1 > s1.length()) {
                char leftchar = s2.charAt(l);
                if (map.containsKey(leftchar)) {
                    if (win.get(leftchar).equals(map.get(leftchar))) {
                        formed--;
                    }
                    else if (win.get(leftchar).equals(map.get(leftchar) + 1)) {
                        formed++;
                    }
                }
                win.put(leftchar, win.get(leftchar) - 1);
                l++;
            }
            if (r - l + 1 == s1.length() && formed == required) {
                return true;
            }
        }
        return false;
    }
}