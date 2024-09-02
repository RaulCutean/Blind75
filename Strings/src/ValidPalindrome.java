public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        int length = s.length();
        int left = 0 ;
        int right = length - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left ++;
            right--;
        }


        return true ;
    }


    public static void main(String[] args) {

        ValidPalindrome v = new ValidPalindrome();
        String s = "A man, a plan , a canal: Panama";
        System.out.println(v.isPalindrome(s));

    }


}
