class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gsum=0;
        int csum=0;
        for(int i=0;i<gas.length;i++){
            gsum+=gas[i];
            csum+=cost[i];
        }
        if(gsum<csum){
            return -1;
        }
        int cur=0;
        int c=0;
        for(int i=0;i<gas.length;i++){
            cur+=gas[i]-cost[i];
            if(cur<0){
                cur=0;
                c=i+1;
            }
        }
        return c;
    }
}