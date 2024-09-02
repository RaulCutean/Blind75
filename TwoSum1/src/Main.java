import java.util.HashMap;

class Solution {
    public int[] TwoSum (int[] nums , int target){
        HashMap<Integer , Integer> HM = new HashMap<>();


        for(int i = 0 ; i < nums.length; i++) {
            int complement = target - nums[i];
            if(HM.containsKey(complement)){
                return new int[]{i , HM.get(complement)};
            }
            else {
                HM.put(nums[i] , i);
            }
        }



        return new int[]{0 , 0};
    }
}