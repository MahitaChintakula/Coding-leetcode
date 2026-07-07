class Solution {
    public long sumAndMultiply(int n) {
        int d=1,sum=0;
        long res=0;
        while(n/d>=10){
            d=d*10;  
        }
        while(d>0){
            int dig=n/d;
            sum=sum+dig;
            if(dig!=0){
                res=res*10+dig;
            }
            n=n%d;
            d=d/10;
        }
        return sum*res;
    }
}