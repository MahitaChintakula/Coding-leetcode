class Solution {
    public int hIndex(int[] citations) {
        // int n=citations.length;
        // int max=0;
        // for(int i=1;i<=n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(citations[j]>=i){
        //         count++;
        //     }
        //     }
        //     if(count>=i){
        //         max++;
        //     }
        // }
        // return max;
        int n=citations.length;
        int[] count=new int[n+1];
        for(int c : citations){
            if(c>=n){
                count[n]++;
            }
            else{
                count[c]++;
            }
        }
        int paper=0;
        for(int h=n;h>=0;h--){
            paper=paper+count[h];
            if(paper>=h){
                return h;
            }
        }
        return 0;
    }
}