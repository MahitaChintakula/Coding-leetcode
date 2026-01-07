class Solution {
    public int reverse(int x) {
        long res=0;
        int num=Math.abs(x);
        while(num>0){
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        if(x<0){
            return (int)-res;
        }
        else{
            return (int)res;
        }
    }
}