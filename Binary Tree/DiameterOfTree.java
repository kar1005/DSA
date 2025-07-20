class DiameterOfTree {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int height = findHeight(root);
        return diameter;
    }
    public int findHeight(TreeNode root){
        if(root==null)
            return 0;
        int left = findHeight(root.left);
        int right = findHeight(root.right);

        diameter = Math.max(diameter,left+right);

        return 1 + Math.max(left,right);
    }
}