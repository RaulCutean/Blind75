import java.util.Scanner;

class Solution {


    public boolean containsDuplicate(int[] nums){
        int cnt  = 0;
        for(int i = 0 ; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++ ){
                if(nums[i] == nums[j])
                    return true;
            }
        }

        return false;
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


        Solution solution = new Solution();

        boolean result = solution.containsDuplicate(arr);

        System.out.println(result);


    }
}