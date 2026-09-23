class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=piles[0];
        for(int i=1;i<piles.length;i++){
            right=Math.max(piles[i],right);
        }
        int ans=right;
        while(left<=right){
            int mid=(left+right)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                int t = (int) (((long) piles[i] + mid - 1) / mid);
                sum=sum+t;
            }
            if(sum>h){
                //right=right;
                left=mid+1;
            }
            else{
                //left=left;
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
}