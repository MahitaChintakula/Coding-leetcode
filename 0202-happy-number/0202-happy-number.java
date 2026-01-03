class Solution {
    public boolean isHappy(int n) {
        while(n!=1){
            int sq=0;
            while(n>0){
                int rem=n%10;
                sq+=rem*rem;
                n=n/10;
            }
            n=sq;
            if(n==4) return false;
        }
        return true;
    }
}