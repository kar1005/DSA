import java.util.Stack;
class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character ch: s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if((ch=='}' && top!='{') ||
                   (ch==']' && top!='[') ||
                   (ch==')' && top!='(')
                )return false;
            }
        }
        return stack.isEmpty();
    }
}