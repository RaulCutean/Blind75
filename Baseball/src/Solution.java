import java.util.Stack;

public class Solution {
        public int calPoints(String[] operations) {
            Stack<Integer> stack = new Stack<>();
            int val1 = 0;
            int val2 = 0;
            int temp = 0;
            for(int i = 0 ; i < operations.length; i++){
                switch(operations[i]){
                    case "C":
                        stack.pop();
                        break;
                    case "D":
                        stack.push(stack.getLast() * 2);
                        break;
                    case "+":
                        stack.push(stack.get(stack.size() - 1 ) + stack.get(stack.size() - 2));
                        break;
                    default:
                        stack.push(Integer.parseInt(operations[i]));


                }
            }
            int sum = 0;
            while(!stack.isEmpty()){
                sum += stack.pop();
            }
            System.out.println();
            return sum;
        }

        public static void main(String[] args ){
            String[] s = {"5" , "-2" , "4", "C" , "D","9" ,"+" , "+"};

            Solution solution = new Solution();

            System.out.println(solution.calPoints(s));


        }
}

