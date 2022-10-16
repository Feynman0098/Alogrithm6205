public class LCAOfBT236 {

    public static TreeNode resNode;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        resNode = root;
        findLCA(root, p.val, q.val);
        return resNode;
    }

    public static int findLCA(TreeNode node, int p, int q) {
        if (node == null) return 0;
        int left = findLCA(node.left, p, q);
        int right = findLCA(node.right, p, q);
        if (left == 0 && right == 0) {
            if (node.val != p && node.val != q) return 0;
            else return 1;
        } else {
            if (left==1 && right==1) {
                resNode = node;
                return 2;
            }
            if (node.val != p && node.val != q) {
                return left+right;
            } else {
                resNode = node;
                return 2;
            }

        }

    }

}
