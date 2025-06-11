//GFG:https://www.geeksforgeeks.org/problems/remove-the-balls--170647/1

import java.util.*;
class RemoveTheBalls {
    public int findLength(int[] color, int[] radius) {
        int N = color.length;
        Stack<Integer> stack = new Stack<>(); 
        for (int i = 0; i < N; i++) {
            if (!stack.isEmpty() && 
                color[i] == color[stack.peek()] && 
                radius[i] == radius[stack.peek()]) { 
                stack.pop(); 
            } else {
                stack.push(i);
            }
        }
        return stack.size();
    }
}