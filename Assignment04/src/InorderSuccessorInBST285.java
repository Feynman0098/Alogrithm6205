public class InorderSuccessorInBST285 {
    boolean status = false;
    TreeNode res;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorder(root, p);
        return res;
    }

    public void inorder(TreeNode node, TreeNode p) {
        if (node == null) return;
        inorder(node.left, p);
        if (status) {
            res = node;
            status = false;
        }
        if (node.val == p.val) {
            status = true;
        }
        inorder(node.right, p);
    }
}
