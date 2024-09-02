public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s , int k) {
        int[] occurance = new int[26];
        int left = 0 ;
        int right = 0 ;
        int maxOccurance = 0 ;
        int answer = 0 ;

        for(right = 0 ; right < s.length() ; right++) {
            maxOccurance = Math.max(maxOccurance , ++occurance[s.charAt(right) - 'A']);
            if(right - left - maxOccurance + 1 > k) {
                occurance[s.charAt(left) - 'A']--;
                left ++;
            }
            answer = Math.max(answer , right-left + 1);
        }
        return answer;
    }



    public static void main (String[] args) {
        String s = new String("AABABBA");
        int k = 1 ;
        LongestRepeatingCharacterReplacement lr = new LongestRepeatingCharacterReplacement();
        System.out.println(lr.characterReplacement(s,k));
    }



}
