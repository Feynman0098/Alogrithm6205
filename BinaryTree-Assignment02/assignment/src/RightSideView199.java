import java.util.ArrayList;
import java.util.List;

public class RightSideView199 {

    public static List<Integer> rightSideView(TreeNode root) {
        List list = new ArrayList();
        int level = 0;
        addToList(root, list, level);
        return list;
    }

    public static void addToList (TreeNode node, List list, int level) {
        if (node == null) return;
        level++;
        if (list.size() < level) list.add(node.val);
        addToList(node.right, list, level);
        addToList(node.left, list, level);
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

        System.out.println(rightSideView(root));

    }

}
