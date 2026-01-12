class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1,r=num;
        while(l<=r){
            int mid=(l+r)/2;
            long ms=(long)mid*mid;
            if(ms==num) return true;
            else if(ms>num){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}