class maxPathSum {
    int maxVal = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int height = maxGain(root);
        return maxVal;
    }
    public int maxGain(TreeNode node){
        if(node==null)
            return 0;
        
        //handling nagative values
        int left = Math.max(maxGain(node.left), 0);
        int right = Math.max(maxGain(node.right), 0);

        int priceNewPath = node.val + left + right;

        maxVal = Math.max(maxVal, priceNewPath);

        return node.val + Math.max(left, right);
    }
}