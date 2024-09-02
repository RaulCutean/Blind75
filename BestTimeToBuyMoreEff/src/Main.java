import java.util.Scanner;

class Solution {

    public int maxProfit(int[] prices) {
        int maxim = 0 ;
        int buyPrice = prices[0];
        if(prices.length <= 1){
            return 0;
        }
        for(int i = 1 ; i < prices.length; i++) {
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else if( (prices[i] - buyPrice) > maxim){
                maxim  = prices[i] - buyPrice;
            }

        }
        return maxim ;

    }



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");


        Solution solution = new Solution();

        System.out.println(solution.maxProfit(arr));



    }
}
