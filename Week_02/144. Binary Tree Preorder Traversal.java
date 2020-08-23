//2020-08-23 1# 堆栈方式目前掌握不够
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        preorderTraversalWithRescivion(root,result);
        return result;
    }

    private void preorderTraversalWithRescivion(TreeNode root, List<Integer> result) {
        if (root==null) return  ;
        result.add(root.val);
        preorderTraversalWithRescivion(root.left,result);
        preorderTraversalWithRescivion(root.right,result);
    }
}