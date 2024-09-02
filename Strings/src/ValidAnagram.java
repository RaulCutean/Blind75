public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        int[] arrS = new int[26];
        int[] arrT = new int[26];
        if(s.length() != t.length()) {
            return false ;
        }
        for(int i = 0 ; i < s.length() ; i++){
            ++arrS[s.charAt(i) - 'a'];
            ++arrT[t.charAt(i) - 'a'];
        }
        for(int i = 0 ; i < arrS.length ; i++){
            System.out.print(arrS[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < arrT.length ; i++){
            System.out.print(arrT[i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i < arrS.length ; i++){
            if(arrS[i] != arrT[i]){
                return false ;
            }
        }


        return true ;
    }


    public static void main(String[] args) {

        ValidAnagram va = new ValidAnagram();
        String s = "rat";
        String t = "car";
        System.out.println(va.isAnagram(s , t));

    }
}
