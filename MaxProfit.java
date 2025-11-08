public class MaxProfit{
    static int Maxprofit(int[] prices){
        int MaxProfit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                MaxProfit+=prices[i+1]-prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[]={1,2,3,4,5};
        System.out.println(Maxprofit(prices));
    }
}