import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            switch(ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case  ')':
                case  ']':
                case  '}':
                    if(!stack.isEmpty()){
                        char chx = stack.pop();
                        if( (chx == '(' && ch != ')' ) || (chx == '[' && ch != ']') || (chx == '{' && ch != '}')) {
                            return false;
                        } else {
                            return false;
                        }

                    }
                default:
                    break;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s = "(]";
        System.out.println(v.isValid(s));
    }

}
