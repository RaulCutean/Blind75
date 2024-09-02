public class LongestPalindromicSubstr {

    public String longestPalindrome(String s) {
        int left = 0 , right = 0 ;
        int[] ans = { 0 , 0 };


        for(int i = 1 ; i < s.length() - 1; i++) {
            if(s.charAt(i - 1) == s.charAt(i + 1)) {
                int middle = i ;
                right = middle + 1;
                left = middle - 1;
                while(s.charAt(left) == s.charAt(right) && left > 0 && right <= s.length()) {
                    left -- ;
                    right ++ ;
                }
                ans[0] = left;
                ans[1] = right;
            }
        }
        String answerString = s.substring(ans[0], ans[1] );

        return answerString;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstr lps = new LongestPalindromicSubstr();

        System.out.println(lps.longestPalindrome("madam"));
    }

}
