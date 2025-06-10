class MaxParenthesisDepth {
    public int maxDepth(String s) {
        int depth = 0;
        int count = 0;
        for(char c: s.toCharArray()){
            if(c=='('){
                count++;
                depth = Math.max(count,depth);
            }else if(c==')')
                count--;
        }
        return depth;
    }
}