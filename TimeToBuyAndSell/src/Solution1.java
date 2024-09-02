import java.util.Scanner;

public class Solution1 {

    public int profit(int[] prices){
        int maxim = -99999999;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1000000000];

        if(prices.length == 1 || prices.length == 0){
            return 0 ;
        }
        int k = 0 ;
        for(int i = 0 ; i < prices.length; i++) {
            for(int j = i+1 ; j < prices.length; j++) {
                arr[k] = prices[j] - prices[i];
                k++;
            }
        }

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > maxim){
                maxim = arr[i];
            }
        }
        if(maxim <= 0){
            return 0;
        }

        return maxim;
    }

}
