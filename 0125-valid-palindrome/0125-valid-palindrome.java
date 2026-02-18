class Solution {
    public boolean isPalindrome(String s) {
        String c=s.replaceAll("[^a-zA-Z0-9]","");
        String cs=c.toLowerCase();
        String reversed = new StringBuilder(cs).reverse().toString();
       if (cs.equals(reversed)) {
         return true;
        } 
      return false;
    }
}