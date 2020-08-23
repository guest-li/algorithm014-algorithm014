class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        inorderTraversalWithRescivion(root,result);
        return result;
    }

    private void inorderTraversalWithRescivion(TreeNode root, List<Integer> result) {
        if (root==null) return  ;
        inorderTraversalWithRescivion(root.left,result);
        result.add(root.val);
        inorderTraversalWithRescivion(root.right,result);
    }
}