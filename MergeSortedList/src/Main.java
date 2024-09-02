import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];

        for(int i = 0 ; i < nums.length ; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean isThereSorting;
        int i = 0;
        do{
            isThereSorting = false;
            for(int j = 0 ; j < nums.length - i - 1; j++){
                if(nums[j] < nums[j+1]){
                    swap(j , j+1 , nums);
                    isThereSorting = true;
                }

            }
            i++;

        }while(isThereSorting);
        for(i = 0 ; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for( i = 1 ; i < nums.length ; i++) {
            int key = nums[i];
            int j = i-1 ;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;

            }
            nums[j+1] = key;
        }
        for( i = 0 ; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int length = nums.length;
        int target = scanner.nextInt();
        int lowerBound = nums[0];
        int upperBound = nums[length-1];
        int middle;
        while(lowerBound <= upperBound) {
            middle = (lowerBound + upperBound) / 2;
            if(nums[middle] == target){
                System.out.println(nums[middle]);

            }
            if(nums[middle] > target){
                upperBound = middle - 1;
            }
            else{
                lowerBound = middle + 1;
            }

            System.out.println(middle);
        }


    }
    static void swap (int i , int j , int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}