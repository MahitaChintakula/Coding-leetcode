class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(weights[i],left);
            right=right+weights[i];
        }
        while(left<right){
            int count=1,cw=0;
            int mid=(left+right)/2;
            for(int i=0;i<weights.length;i++){
                if(weights[i]+cw>mid){
                 count++;
                 cw=weights[i];
                }else{
                    cw+=weights[i];
                }
            }
            if(count>days){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return right;
    }
}