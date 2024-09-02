import java.util.Scanner;

class Solution {

    public int maxProfit(int[] prices) {
        int maxim = 0 ;
        for(int buy = 0 ; buy < prices.length-1; buy++) {
            for(int sell = buy+1; sell < prices.length; sell++) {
                if((prices[sell] - prices[buy]) > maxim ){
                    maxim = (prices[sell] - prices[buy]);
                }
            }
        }


        return maxim;
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
