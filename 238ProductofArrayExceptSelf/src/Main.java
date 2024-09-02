import java.util.Scanner;

class Solution {

    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int [nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i = 1 ; i < nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println(" ");
        for(int i = nums.length-2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];

        }
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(right[i] + " ");
        }
        System.out.println(" ");
        answer[0] = right[0];
        answer[nums.length-1] = left[nums.length-1];

        for(int i = 1; i < nums.length-1; i++){
            answer[i] = right[i] * left[i];
        }
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(answer[i] + " ");
        }


        return answer;
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

        System.out.println(solution.productExceptSelf(arr));



    }

}