import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean pop = true ;
        for(int i = 0 ; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch(ch){
                case '(':
                    stack.push(ch);

                    break;
                case ')':
                    pop = false;
                    if(!stack.isEmpty()){

                        char chx = stack.pop();
                        if(ch == ')' && chx == '('){
                            arr.add(1);
                            arr.add(1);
                            pop = true;
                        }
                    }
                default:
                    if( i != s.length() && !pop ){
                        arr.add(0);
                    }
            }
        }
        int temp = 1 ;
        int ans = 1;
        for(int i = 1; i < arr.size() ; i++)
        {

            // If element is same as
            // previous increment temp value
            if (arr.get(i) == arr.get(i-1))
            {
                ++temp;
            }
            else
            {
                ans = Math.max(ans, temp);
                temp = 1;
            }
        }
        ans = Math.max(ans, temp);

        for(int i = 0 ; i< arr.size() ;i++ ){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        return ans;
    }


    public static void main(String[] args) {

        String str = "()(()";
        Solution solution = new Solution();

        System.out.println(solution.longestValidParentheses(str));
    }

}