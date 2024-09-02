import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        System.out.println("HASHMAP");
        Scanner scanner = new Scanner(System.in);


        int target = scanner.nextInt();
        int[] nums = new int[scanner.nextInt()];

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1 ; j< nums.length ; j++) {
                if(nums[i] + nums[j] == target){
                    System.out.println(i +" " +j);

                }

            }

        }

    }
}