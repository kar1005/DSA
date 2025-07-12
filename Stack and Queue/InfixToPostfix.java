import java.util.*;

public class InfixToPostfix {

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static int precedence(char op) {
        switch (op) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return -1;
        }
    }

    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    private static boolean isValidExpression(String expr) {
        int balance = 0;
        char prev = 0;

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == ' ') continue;

            if (!isOperand(c) && !isOperator(c) && c != '(' && c != ')') {
                return false; 
            }

            if (c == '(') balance++;
            if (c == ')') balance--;

            if (balance < 0) return false; 

            if (isOperator(c) && (i == 0 || isOperator(prev) || prev == '(')) {
                return false;
            }

            if (c != ' ') prev = c;
        }

        return balance == 0; 
    }

    public static String infixToPostfix(String expr) {
        if (!isValidExpression(expr)) {
            return "Invalid Expression";
        }

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == ' ') continue;

            if (isOperand(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                }
            } else { 
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if (c == '^' && stack.peek() == '^') break; 
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') return "Invalid Expression"; 
            result.append(stack.pop());
        }

        return result.toString();
    }
}
