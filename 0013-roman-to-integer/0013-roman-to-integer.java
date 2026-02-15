class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> rom=new HashMap<>();
        rom.put('I',1);
        rom.put('V',5);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        rom.put('M',1000);
        int res=0;
        for(int i=0;i<s.length();i++){
            if(i+1 < s.length() && rom.get(s.charAt(i))<rom.get(s.charAt(i+1))){
                res -=rom.get(s.charAt(i));
            }else{
                res +=rom.get(s.charAt(i));
            }
        }
        return res;
    }
}