import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringHard {

    public String minWindow(String s, String t) {
        int required = 0 ;
        int create = 0 ;
        int left = 0 ;
        int right = 0 ;
        int[] ans = {-1 , 0 , 0};
        Map<Character , Integer> T  = new HashMap<Character , Integer>();
        Map<Character , Integer> substring  = new HashMap<Character , Integer>();
            if ( s.length() < t.length() || s.length() == 0 || t.length() == 0) {
                return "";
            }
        for(int i = 0 ; i < t.length() ; i++) {
            if(T.containsKey(t.charAt(i))){
                T.put(t.charAt(i), T.get(t.charAt(i)) + 1);
            }
            else {
                T.put(t.charAt(i), 1);
            }
        }
        required = T.size() ;
        while(right < s.length()) {
            if (substring.containsKey(s.charAt(right))) {
                substring.put(s.charAt(right), substring.get(s.charAt(right)) + 1);
            } else {
                substring.put(s.charAt(right), 1);
            }
            if(T.containsKey(s.charAt(right)) && substring.get(s.charAt(right)).intValue() ==  T.get(s.charAt(right)).intValue()) {
                create++;
            }
            while(left <= right && required == create){
                if(ans[0] == -1 || ans[0] > right-left+1 ) {
                    ans[0] = right-left+1;
                    ans[1] = left ;
                    ans[2] = right;
                }
                substring.put(s.charAt(left) , substring.get(s.charAt(left)) - 1);
                if(T.containsKey(s.charAt(left)) && substring.get(s.charAt(left)).intValue() < T.get(s.charAt(left)).intValue() ){
                    create -- ;
                }
                left++;
            }
            right++;
        }
        if(ans[0] == -1) {
            return "";
        }
        return s.substring(ans[1] , ans[2] + 1);




    }



    public static void main(String[] args) {
        MinimumWindowSubstringHard min = new MinimumWindowSubstringHard();
        String s = "ABAXCBAC";
        String t = "ABC";
        System.out.println(min.minWindow(s , t));
    }

}
