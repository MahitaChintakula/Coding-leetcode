class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            sum+=newBottles;
            numBottles=newBottles+(numBottles % numExchange);   
        }
        return sum;
    }
}