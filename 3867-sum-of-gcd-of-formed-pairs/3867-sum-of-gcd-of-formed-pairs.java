class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[] prefixgcd=new int[nums.length];
        int mx=0;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            prefixgcd[i]=gcd(mx,nums[i]);
        }
        Arrays.sort(prefixgcd);
        long ans=0;
        int l=0,r=nums.length-1;
        while(l<r){
            ans=ans+gcd(prefixgcd[l],prefixgcd[r]);
            l++;
            r--;
        }    
        return ans;
    }
}