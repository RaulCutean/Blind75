import java.util.HashSet;
import java.util.Scanner;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<Integer>();

        for(int i = 0 ; i < nums.length; i++) {
            if(duplicate.contains(nums[i])){
                return true;
            }
            else{
                duplicate.add(nums[i]);
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
