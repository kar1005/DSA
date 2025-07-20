
class HeightBalanced {
    public boolean isBalanced(TreeNode root) {
        return findHeight(root)!= -1;
    }
    public int findHeight(TreeNode root){
        if(root==null)
            return 0;
        
        int leftHeight = findHeight(root.left);

        if (leftHeight == -1) 
            return -1;

        int rightHeight = findHeight(root.right); 

        if(rightHeight == -1)
            return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1)  
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}