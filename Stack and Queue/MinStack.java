import java.util.Stack;
class MinStack {

     Stack < Pair > st;

    public MinStack() {
        st = new Stack < > ();
    }
    
    public void push(int val) {
        int min;
        if (st.isEmpty()) {
            min = val;
        } else {
            min = Math.min(st.peek().y, val);
        }
        st.push(new Pair(val, min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
        return st.peek().y;
    }
}
class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}