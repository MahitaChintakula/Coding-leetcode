class Solution {
    public boolean isPalindrome(String s) {
        // String c=s.replaceAll("[^a-zA-Z0-9]", "");
        // String cs=c.toLowerCase();
        // String rev=new StringBuilder(cs).reverse().toString();
        // if(cs.equals(rev)){
        //     return true;
        // }
        // return false;
        int left=0;
        int right=s.length()-1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}