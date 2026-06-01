class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int t=0;
        int n=cost.length;
        for(int i=0;i<n;i+=3){
            t+=cost[n-1-i];
            if(i+1 < n){
                t=t+cost[n-1-(i+1)];
            }
        }
        return t;
    }
}