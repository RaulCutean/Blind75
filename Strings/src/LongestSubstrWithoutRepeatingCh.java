import java.util.HashSet;

public class LongestSubstrWithoutRepeatingCh {

    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int right = 0 ;
        HashSet<Character> set = new HashSet<>();
        int answer = 0 ;
        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                answer = Math.max(answer , set.size());
            }else {
                set.remove(s.charAt(left));
                left++;
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        LongestSubstrWithoutRepeatingCh ch = new LongestSubstrWithoutRepeatingCh();
        String s = "abcabcbb";
        System.out.println(ch.lengthOfLongestSubstring(s));

    }
}
