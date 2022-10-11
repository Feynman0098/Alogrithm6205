class SymatricTree101 {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode node1, TreeNode node2){
        if (node1==null && node2==null) return true;
        if (node1==null || node2==null) return false;
        return (node1.val==node2.val) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node5;
        node2.left = node6;
        node2.right = node4;

        System.out.println(isSymmetric(root));

    }
}