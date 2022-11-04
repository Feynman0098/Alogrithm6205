import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBST449 {
    String delimiters = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        Queue<TreeNode> queue = new LinkedList<>();
        String res = "";
        queue.offer(root);
        res += root.val;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
                res += delimiters + node.left.val;
            } else {
                res += delimiters + "null";
            }

            if (node.right != null) {
                queue.offer(node.right);
                res += delimiters + node.right.val;
            } else {
                res += delimiters + "null";
            }
        }
        System.out.println(res);
        return res;
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str = data.split(delimiters);
        int n = str.length;
        if (str.length <= 0 || str[0] == "") return null;
        int i = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(str[i]));
        queue.offer(root);
        while (!queue.isEmpty() && i < n-1) {
            i++;
            TreeNode node1;
            if (str[i].equals("null")) {
                node1 = null;
            } else {
                node1 = new TreeNode(Integer.parseInt(str[i]));
                queue.offer(node1);
            }
            i++;
            TreeNode node2;
            if (str[i].equals("null")) {
                node2 = null;
            } else {
                node2 = new TreeNode(Integer.parseInt(str[i]));
                queue.offer(node2);
            }
            TreeNode parent = queue.poll();
            parent.left = node1;
            parent.right = node2;


        }
        return root;
    }
}
