public class MaxDepth104 {

    public int getDepth(TreeNode node){
        if (node == null) return 0;
        return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }

}
