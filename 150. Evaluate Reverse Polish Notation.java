import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        HashMap<String, Integer> operands = new HashMap<>();

        operands.put("+", 1);
        operands.put("-", 1);
        operands.put("*", 1);
        operands.put("/", 1);

        for(int i=0; i<tokens.length; i++) {
            if(operands.containsKey(tokens[i])) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(operate(num1, num2, tokens[i]));
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }

    public int operate(int num1, int num2, String operand) {
        if(operand.equals("+")) {
            return num1 + num2;
        }
        if(operand.equals("-")) {
            return num1 - num2;
        }
        if(operand.equals("*")) {
            return num1 * num2;
        }
        return num1 / num2;
    }

}
