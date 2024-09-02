import java.util.*;

public class GroupAnagrams {

    public ArrayList groupAnagrams(String[] str) {

        int[] occurance = new int[26];
        Map<String , List> answerMap = new HashMap<>();

        for(String s : str) {
            Arrays.fill(occurance , 0);

            for(char c : s.toCharArray()) {
                occurance[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i < occurance.length; i++) {
                sb.append(occurance[i]);
            }
            String key = sb.toString();
            if(!answerMap.containsKey(key)){
                answerMap.put(key , new ArrayList<>());
            }
            answerMap.get(key).add(s);
        }



        return new ArrayList<>(answerMap.values());
    }

    public static void main(String[] args) {

        String[] s = {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams g = new GroupAnagrams();

        System.out.println(g.groupAnagrams(s));

    }

}
