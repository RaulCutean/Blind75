import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character , Integer> HM1 = new HashMap<>();
        Map<Character , Integer> HM2 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(HM1.containsKey(s.charAt(i))){
                HM1.put(s.charAt(i) , HM1.get(s.charAt(i)) + 1);
            }
            else {
                HM1.put(s.charAt(i) , 1);
            }
        }
        for(int i = 0 ; i < t.length() ; i++){
            if(HM2.containsKey(t.charAt(i))){
                HM2.put(t.charAt(i) , HM2.get(t.charAt(i)) + 1);
            }
            else {
                HM2.put(t.charAt(i) , 1);
            }
        }
        for(char k : HM1.keySet()){
           if(HM1.get(k).equals(HM2.get(k))){
               return true;
           }
        }

        return false;
    }
}