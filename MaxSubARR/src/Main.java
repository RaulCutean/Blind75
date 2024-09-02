import java.util.Scanner;

class Solution {
        public int maxSubArray(int[] nums) {

            int maxSoFar = nums[0];
            int max = nums[0];

            for(int i =  1; i < nums.length; i++) {
                maxSoFar = Math.max(nums[i] , maxSoFar + nums[i]);
                max = Math.max(max, maxSoFar);
            }
            return max;

        }



    public static void main(String[] args){

        Scanner n = new Scanner(System.in);

        int[] arr = new int[n.nextInt()];

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = n.nextInt();
        }

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");


        Solution solution = new Solution();

        System.out.println(solution.maxSubArray(arr));



    }

}
