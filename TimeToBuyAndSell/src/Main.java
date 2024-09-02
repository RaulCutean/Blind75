import java.util.Arrays;

public class Main {
    public int maxProfit(int[] prices) {
        int minim = 999999;
        int maxim = -1;
        int found = 0;
        int profit = 0;
        for(int i = 0 ; i < prices.length; i++) {
            if(prices[i] < minim){
                minim = prices[i];
            }

            if(minim == prices[prices.length-1]){

                return 0;
            }
        }
        for(int i = 0 ; i < prices.length; i++){
            if(minim  == prices[i]){
                for(int j = i+1; j < prices.length; j++){
                    if(prices[j] > maxim){
                        maxim = prices[j];
                    }
                }
                if(minim > maxim){
                    return 0;
                }
            }
        }

        return maxim-minim;
    }


}